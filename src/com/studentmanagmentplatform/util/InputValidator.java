
package com.studentmanagmentplatform.util;

import com.studentmanagmentplatform.dao.StudentDAO;
import com.studentmanagmentplatform.model.Student;
import com.studentmanagmentplatform.constant.Message;
import java.util.ArrayList;

public class InputValidator {

	public static int validateAge(int age) {

		System.out.println("[ENTER] InputValidator.validateAge()");

		try {
			if (age < 0 || age > 130) {

				System.out.println(Message.VALIDATION_FAILED);

				throw new IllegalArgumentException("Age should be more than 0 and less 130");
			}

			System.out.println(Message.VALIDATION_PASSED);

			return age;

		} finally {
			System.out.println("[EXIT] InputValidator.validateAge()");
		}
	}

	public static double validateGrade(double grade) {

		System.out.println("[ENTER] InputValidator.validateGrade()");

		try {
			if (grade < 0 || grade > 100) {

				System.out.println(Message.VALIDATION_FAILED);

				throw new IllegalArgumentException("Grade should br more 0 and less 101");
			}

			System.out.println(Message.VALIDATION_PASSED);

			return grade;

		} finally {
			System.out.println("[EXIT] InputValidator.validateGrade()");
		}
	}

	public static String validateString(String name) {

		System.out.println("[ENTER] InputValidator.validateString()");

		try {
			if (name.isBlank()) {

				System.out.println(Message.VALIDATION_FAILED);

				throw new IllegalArgumentException("The text shouldn't be null or whitespaces");
			}

			System.out.println(Message.VALIDATION_PASSED);

			return name;

		} finally {
			System.out.println("[EXIT] InputValidator.validateString()");
		}
	}

	public static String isIdExits(String ID, StudentDAO studentDAO) {

		System.out.println("[ENTER] InputValidator.isIdExits()");

		try {
			if (studentDAO.serachStudent(ID) != null) {

				System.out.println(Message.VALIDATION_FAILED);

				throw new IllegalArgumentException("This ID already exists");
			}

			System.out.println(Message.VALIDATION_PASSED);

			return ID;

		} finally {
			System.out.println("[EXIT] InputValidator.isIdExits()");
		}
	}
}
