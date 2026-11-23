
package com.studentmanagmentplatform.controller;

import com.studentmanagmentplatform.constant.Message;
import com.studentmanagmentplatform.dao.ArrayListStudentDAO;
import com.studentmanagmentplatform.dao.FileStudentDAO;
import com.studentmanagmentplatform.dao.StudentDAO;
import com.studentmanagmentplatform.service.StudentService;
import com.studentmanagmentplatform.util.InputHandler;

public class Main {

	public static void main(String[] args) {

		System.out.println(Message.MAIN_ENTER);

		try {

			StudentDAO listStudents = new ArrayListStudentDAO();
			StudentDAO fileStudents = new FileStudentDAO();

			StudentService studentService = new StudentService(fileStudents);

			boolean flag = true;

			while (flag) {

				System.out.println(Message.MENU_DISPLAYED);

				Message.showMenu();

				int choice = InputHandler.readChioce();

				System.out.println(Message.USER_CHOICE_RECEIVED);

				System.out.print("\n\n\n");

				switch (choice) {

				case 0:

					System.out.println(Message.MAIN_EXIT_SELECTED);

					System.out.println(Message.THANK_MESSAGE);

					flag = false;
					break;

				case 1:

					System.out.println(Message.MAIN_ADD_SELECTED);

					studentService.addStudentService();
					break;

				case 2:

					System.out.println(Message.MAIN_SHOW_SELECTED);

					studentService.showAllStudentsService();
					break;

				case 3:

					System.out.println(Message.MAIN_SEARCH_SELECTED);

					studentService.serachService();
					break;

				case 4:

					System.out.println(Message.MAIN_UPDATE_SELECTED);

					studentService.updateService();
					break;

				case 5:

					System.out.println(Message.MAIN_DELETE_SELECTED);

					studentService.deleteService();
					break;

				default:

					System.out.println(Message.MAIN_INVALID_CHOICE);

					System.out.println(Message.WRONG_CHOICE_MESSAGE);
				}

				System.out.print("\n\n\n");
			}

		} finally {

			System.out.println(Message.MAIN_EXIT);
		}
	}
}
