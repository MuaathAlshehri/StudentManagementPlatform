package com.studentmanagmentplatform.controller;


import java.util.ArrayList;

import java.util.Scanner;

import com.studentmanagmentplatform.constant.Message;
import com.studentmanagmentplatform.model.Student;
import com.studentmanagmentplatform.service.StudentService;
import com.studentmanagmentplatform.util.InputHandler;
import com.studentmanagmentplatform.constant.Message ;


public class Main {

    public static void main(String[] args) {
    	
    	StudentService studentService = new StudentService();
        ArrayList<Student> students = new ArrayList<>();

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
            	studentService.addStudentService(students);
                break;

            case 2:
            	studentService.showAllStudentsService(students);
                break;

            case 3:
            	studentService.serachService(students);
                break;

            case 4:
            	studentService.updateService(students);
                break;

            case 5:
            	studentService.deleteService(students);
                break;

            default:
                System.out.println(Message.WRONG_CHOICE_MESSAGE);
            }

            System.out.print("\n\n\n");
        }
    }    
}
