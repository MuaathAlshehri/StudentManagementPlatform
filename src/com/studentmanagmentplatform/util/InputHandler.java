
package com.studentmanagmentplatform.util;

import java.util.Scanner;
import com.studentmanagmentplatform.constant.Message;

public class InputHandler {

	private static Scanner scn;

	public InputHandler() {

		System.out.println(Message.INPUT_HANDLER_ENTER);

		scn = new Scanner(System.in);

		System.out.println(Message.INPUT_HANDLER_EXIT);
	}

	public static String readString(String message) {

		System.out.println(Message.READ_STRING_ENTER);

		try {
			System.out.println(message);
			String name = scn.nextLine();

			return name;

		} finally {
			System.out.println(Message.READ_STRING_EXIT);
		}
	}

	public static int readAge() {

		System.out.println(Message.READ_AGE_ENTER);

		try {
			System.out.println("Enter student age: ");
			int age = scn.nextInt();
			scn.nextLine();

			return age;

		} finally {
			System.out.println(Message.READ_AGE_EXIT);
		}
	}

	public static double readGrade() {

		System.out.println(Message.READ_GRADE_ENTER);

		try {
			System.out.println("Enter student grade: ");
			double grade = scn.nextDouble();
			scn.nextLine();

			return grade;

		} finally {
			System.out.println(Message.READ_GRADE_EXIT);
		}
	}

	public static int readChioce() {

		System.out.println(Message.READ_CHOICE_ENTER);

		try {
			System.out.print("Enter your choice: ");
			int choice = scn.nextInt();
			scn.nextLine();

			return choice;

		} finally {
			System.out.println(Message.READ_CHOICE_EXIT);
		}
	}
}
