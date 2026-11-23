
package com.studentmanagmentplatform.service;

import java.util.ArrayList;
import com.studentmanagmentplatform.dao.StudentDAO;
import com.studentmanagmentplatform.model.Student;
import com.studentmanagmentplatform.util.InputHandler;
import com.studentmanagmentplatform.util.InputValidator;
import com.studentmanagmentplatform.constant.Message;

public class StudentService {

	private StudentDAO studentDao;
	InputHandler in = new InputHandler();

	public StudentService(StudentDAO studentDao) {

		System.out.println(Message.SERVICE_CONSTRUCTOR_ENTER);

		this.studentDao = studentDao;

		System.out.println(Message.SERVICE_CONSTRUCTOR_EXIT);
	}

	public void addStudentService() {

		System.out.println(Message.ADD_SERVICE_ENTER);

		try {

			System.out.println(Message.SERVICE_ADD_INFO);

			String nationalID = InputValidator.isIdExits(InputHandler.readString(Message.GET_ID_MESSAGE), studentDao);

			String name = InputValidator.validateString(InputHandler.readString(Message.GET_NAME_MESSAGE));

			int age = InputValidator.validateAge(InputHandler.readAge());

			double grade = InputValidator.validateGrade(InputHandler.readGrade());

			Student student = new Student(nationalID, name, age, grade);

			studentDao.addStudent(student);

			System.out.println("Student added successfully.");

		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());

		} finally {

			System.out.println(Message.ADD_SERVICE_EXIT);
		}
	}

	public void showAllStudentsService() {

		System.out.println(Message.SHOW_SERVICE_ENTER);

		try {

			System.out.println(Message.SERVICE_SHOW_INFO);

			ArrayList<Student> students = studentDao.getAllStudents();

			if (students.size() == 0) {

				System.out.println("\nNo students found!");

			} else {

				students.forEach(student -> {
					student.show();
					System.out.println("\n");
				});
			}

		} finally {

			System.out.println(Message.SHOW_SERVICE_EXIT);
		}
	}

	public void serachService() {

		System.out.println(Message.SEARCH_SERVICE_ENTER);

		try {

			System.out.println(Message.SERVICE_SEARCH_INFO);

			String nationalID = InputValidator.validateString(InputHandler.readString(Message.GET_ID_MESSAGE));

			Student st1 = studentDao.serachStudent(nationalID);

			if (st1 != null) {

				st1.show();

			} else {

				System.out.println("Student not found!");
			}

		} finally {

			System.out.println(Message.SEARCH_SERVICE_EXIT);
		}
	}

	public void updateService() {

		System.out.println(Message.UPDATE_SERVICE_ENTER);

		try {

			System.out.println(Message.SERVICE_UPDATE_INFO);

			String nationalID = InputValidator.validateString(InputHandler.readString(Message.GET_ID_MESSAGE));

			Student student = studentDao.serachStudent(nationalID);

			if (student == null) {

				System.out.println("\nStudent Not found");

			} else {

				try {

					String name = InputValidator.validateString(InputHandler.readString(Message.GET_NAME_MESSAGE));

					int age = InputValidator.validateAge(InputHandler.readAge());

					double grade = InputValidator.validateGrade(InputHandler.readGrade());

					student.setName(name);

					student.setAge(age);

					student.setGrade(grade);

					studentDao.updateStudent(student);

					System.out.println("Update done");

				} catch (IllegalArgumentException e) {

					System.out.println(e.getMessage());
				}
			}

		} finally {

			System.out.println(Message.UPDATE_SERVICE_EXIT);
		}
	}

	public void deleteService() {

		System.out.println(Message.DELETE_SERVICE_ENTER);

		try {

			System.out.println(Message.SERVICE_DELETE_INFO);

			String nationalID = InputValidator.validateString(InputHandler.readString(Message.GET_ID_MESSAGE));

			Student student = studentDao.serachStudent(nationalID);

			if (student == null) {

				System.out.println("\nStudent Not found");

			} else {

				studentDao.deleteStudent(student);

				System.out.println("Student deleted successfully.");
			}

		} finally {

			System.out.println(Message.DELETE_SERVICE_EXIT);
		}
	}
}
