
package com.studentmanagmentplatform.dao;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;

import com.studentmanagmentplatform.model.Student;
import com.studentmanagmentplatform.constant.Message;

public class FileStudentDAO implements StudentDAO {

	private Path pathfile;

	public FileStudentDAO() {
		this.pathfile = Path.of("Students.txt");
		System.out.println(pathfile.toAbsolutePath());
	}

	@Override
	public void addStudent(Student student) {

		System.out.println(Message.DAO_ADD_ENTER);

		String age = Integer.toString(student.getAge());
		String grade = Double.toString(student.getGrade());
		String data = student.getNationalId() + "," + student.getName() + "," + age + "," + grade + ","
				+ student.isPassed() + "," + student.hisGrade() + System.lineSeparator();

		try {

			System.out.println(Message.FILE_WRITING);

			Files.writeString(pathfile, data, StandardCharsets.UTF_8, StandardOpenOption.CREATE,StandardOpenOption.APPEND);

			System.out.println(Message.FILE_OPERATION_SUCCESS);
			System.out.println(Message.STUDENT_ADDED);

		} catch (IOException e) {

			System.out.println(Message.FILE_OPERATION_FAILED);

			throw new UncheckedIOException("Failed to add student", e);

		} finally {
			System.out.println(Message.DAO_ADD_EXIT);
		}
	}

	@Override
	public void deleteStudent(Student student) {

		System.out.println(Message.DAO_DELETE_ENTER);

		if (Files.notExists(pathfile)) {

			System.out.println(Message.FILE_NOT_FOUND);
			System.out.println(Message.DAO_DELETE_EXIT);
			return;
		}

		try {

			System.out.println(Message.FILE_READING);

			List<String> lines = Files.readAllLines(pathfile);

			lines.removeIf(line -> {
				String[] data = line.split(",", -1);
				return data[0].equals(student.getNationalId());
			});

			System.out.println(Message.FILE_WRITING);

			Files.write(pathfile, lines, StandardCharsets.UTF_8, StandardOpenOption.TRUNCATE_EXISTING,
					StandardOpenOption.WRITE);

			System.out.println(Message.STUDENT_DELETED);
			System.out.println(Message.FILE_OPERATION_SUCCESS);

		} catch (IOException e) {

			System.out.println(Message.FILE_OPERATION_FAILED);

			throw new UncheckedIOException("Failed to delete student", e);

		} finally {
			System.out.println(Message.DAO_DELETE_EXIT);
		}
	}

	@Override
	public Student serachStudent(String ID) {

		System.out.println(Message.DAO_SEARCH_ENTER);

		for (Student student : getAllStudents()) {

			if (student.getNationalId().equals(ID)) {

				System.out.println(Message.STUDENT_FOUND);
				System.out.println(Message.DAO_SEARCH_EXIT);

				return student;
			}
		}

		System.out.println(Message.STUDENT_NOT_FOUND);
		System.out.println(Message.DAO_SEARCH_EXIT);

		return null;
	}

	@Override
	public ArrayList<Student> getAllStudents() {

		System.out.println(Message.DAO_GET_ALL_ENTER);

		ArrayList<Student> students = new ArrayList<>();

		if (Files.notExists(pathfile)) {

			System.out.println(Message.FILE_NOT_FOUND);
			System.out.println(Message.DAO_GET_ALL_EXIT);

			return students;
		}

		try {

			System.out.println(Message.FILE_READING);

			List<String> lines = Files.readAllLines(pathfile);

			for (String line : lines) {

				if (line.isBlank()) {
					continue;
				}

				String[] data = line.split(",", -1);

				Student student = new Student(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]));

				students.add(student);
			}

			System.out.println(Message.FILE_OPERATION_SUCCESS);

		} catch (IOException e) {

			System.out.println(Message.FILE_OPERATION_FAILED);

			throw new UncheckedIOException("Failed to read students", e);

		} finally {
			System.out.println(Message.DAO_GET_ALL_EXIT);
		}

		return students;
	}

	@Override
	public void updateStudent(Student student) {

		System.out.println(Message.DAO_UPDATE_ENTER);

		ArrayList<Student> students = getAllStudents();

		for (int i = 0; i < students.size(); i++) {

			if (students.get(i).getNationalId().equals(student.getNationalId())) {

				students.set(i, student);
				break;
			}
		}

		try {

			ArrayList<String> lines = new ArrayList<>();

			for (Student s : students) {

				String data = s.getNationalId() + "," + s.getName() + "," + s.getAge() + "," + s.getGrade();

				lines.add(data);
			}

			System.out.println(Message.FILE_WRITING);

			Files.write(pathfile, lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING);

			System.out.println(Message.STUDENT_UPDATED);
			System.out.println(Message.FILE_OPERATION_SUCCESS);

		} catch (IOException e) {

			System.out.println(Message.FILE_OPERATION_FAILED);

			throw new UncheckedIOException("Failed to update student", e);

		} finally {
			System.out.println(Message.DAO_UPDATE_EXIT);
		}
	}
}
