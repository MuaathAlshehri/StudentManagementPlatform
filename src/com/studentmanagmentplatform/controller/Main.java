package com.studentmanagmentplatform.controller;



import com.studentmanagmentplatform.constant.Message;
import com.studentmanagmentplatform.dao.ArrayListStudentDAO;
import com.studentmanagmentplatform.dao.FileStudentDAO;
import com.studentmanagmentplatform.dao.StudentDAO;
import com.studentmanagmentplatform.service.StudentService;
import com.studentmanagmentplatform.util.InputHandler;



public class Main {

    public static void main(String[] args) {
    	
    	StudentDAO listStudents = new ArrayListStudentDAO();
    	StudentDAO fileStudents = new FileStudentDAO();
    	StudentService studentService = new StudentService(fileStudents);
        

        boolean flag = true;

        while (flag) {

            Message.showMenu();
            
            int choice = InputHandler.readChioce();

            System.out.print("\n\n\n");

            switch (choice) {
            case 0:
                System.out.println(Message.THANK_MESSAGE);
                flag = false;
                break;

            case 1:
            	studentService.addStudentService();
                break;

            case 2:
            	studentService.showAllStudentsService();
                break;

            case 3:
            	studentService.serachService();
                break;

            case 4:
            	studentService.updateService();
                break;

            case 5:
            	studentService.deleteService();
                break;

            default:
                System.out.println(Message.WRONG_CHOICE_MESSAGE);
            }

            System.out.print("\n\n\n");
        }
    }    
}
