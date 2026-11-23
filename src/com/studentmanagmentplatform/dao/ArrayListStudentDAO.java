
package com.studentmanagmentplatform.dao;

import java.util.ArrayList;
import com.studentmanagmentplatform.model.Student;
import com.studentmanagmentplatform.constant.Message;

public class ArrayListStudentDAO implements StudentDAO {

	private ArrayList<Student> students = new ArrayList<Student>();

	@Override
	public void addStudent(Student student) {

		System.out.println(Message.DAO_ADD_ENTER);

		students.add(student);

		System.out.println(Message.STUDENT_ADDED);
		System.out.println(Message.DAO_ADD_EXIT);
	}

	@Override
	public void deleteStudent(Student student) {

		System.out.println(Message.DAO_DELETE_ENTER);

		students.remove(student);

		System.out.println(Message.STUDENT_DELETED);
		System.out.println(Message.DAO_DELETE_EXIT);
	}

	@Override
	public Student serachStudent(String ID) {

		System.out.println(Message.DAO_SEARCH_ENTER);

		for (Student student : students) {

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

		System.out.println(Message.DAO_GET_ALL_EXIT);

		return students;
	}

	@Override
	public void updateStudent(Student student) {

		System.out.println(Message.DAO_UPDATE_ENTER);

		System.out.println(Message.DAO_UPDATE_EXIT);
	}
}
