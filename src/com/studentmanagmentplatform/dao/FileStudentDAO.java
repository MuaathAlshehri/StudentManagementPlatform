
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

public class FileStudentDAO implements StudentDAO {

	private Path pathfile;

	public FileStudentDAO() {
		this.pathfile = Path.of("Students.txt");
		System.out.println(pathfile.toAbsolutePath());
	}

	@Override
	public void addStudent(Student student) {
		String age = Integer.toString(student.getAge());
		String grade = Double.toString(student.getGrade());
		String data = student.getNationalId() + "," + student.getName() + "," + age + "," + grade + ","
				+ student.isPassed() + "," + student.hisGrade() + System.lineSeparator();

		try {
			Files.writeString(pathfile, data, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
		} catch (IOException e) {
			throw new UncheckedIOException("Failed to add student", e);
		}
	}

	@Override
	public void deleteStudent(Student student) {

		if (Files.notExists(pathfile)) {
			return;
		}

		try {
			List<String> lines = Files.readAllLines(pathfile);

			lines.removeIf(line -> {
				String[] data = line.split(",", -1);
				return data[0].equals(student.getNationalId());
			});

			Files.write(pathfile, lines, StandardCharsets.UTF_8, StandardOpenOption.TRUNCATE_EXISTING,
					StandardOpenOption.WRITE);

		} catch (IOException e) {
			throw new UncheckedIOException("Failed to delete student", e);
		}
	}

	@Override
	public Student serachStudent(String ID) {

		for (Student student : getAllStudents()) {

			if (student.getNationalId().equals(ID)) {
				return student;
			}
		}

		return null;
	}

	@Override
	public ArrayList<Student> getAllStudents() {

		ArrayList<Student> students = new ArrayList<>();

		if (Files.notExists(pathfile)) {
			return students;
		}

		try {
			List<String> lines = Files.readAllLines(pathfile);

			for (String line : lines) {

				if (line.isBlank()) {
					continue;
				}

				String[] data = line.split(",", -1);

				Student student = new Student(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]));

				students.add(student);
			}

		} catch (IOException e) {
			throw new UncheckedIOException("Failed to read students", e);
		}

		return students;
	}
	
	@Override
	public void updateStudent(Student student) {

	    ArrayList<Student> students = getAllStudents();

	    for (int i = 0; i < students.size(); i++) {

	        if (students.get(i).getNationalId()
	                .equals(student.getNationalId())) {

	            students.set(i, student);
	            break;
	        }
	    }

	    try {
	        ArrayList<String> lines = new ArrayList<>();

	        for (Student s : students) {

	            String data = s.getNationalId() + "," +
	                          s.getName() + "," +
	                          s.getAge() + "," +
	                          s.getGrade();

	            lines.add(data);
	        }

	        Files.write(
	            pathfile,
	            lines,
	            StandardCharsets.UTF_8,
	            StandardOpenOption.CREATE,
	            StandardOpenOption.TRUNCATE_EXISTING
	        );

	    } catch (IOException e) {
	        throw new UncheckedIOException("Failed to update student", e);
	    }
	}
}
