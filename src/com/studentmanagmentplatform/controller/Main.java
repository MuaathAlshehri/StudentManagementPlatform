package com.studentmanagmentplatform.controller;


import java.util.ArrayList;

import java.util.Scanner;

import com.studentmanagmentplatform.constant.Message;
import com.studentmanagmentplatform.model.Student;
import com.studentmanagmentplatform.service.StudentService;
import com.studentmanagmentplatform.constant.Message ;
import com.studentmanagmentplatform.service.Input;


public class Main {

    public static void main(String[] args) {
    	
    	StudentService studentService = new StudentService();
        ArrayList<Student> students = new ArrayList<>();

        boolean flag = true;

        while (flag) {

            Message.showMenu();
            
            int choice = Input.readChioce();

            System.out.print("\n\n\n");

            switch (choice) {
            case 0:
                System.out.println(Message.THANK_MESSAGE);
                flag = false;
                break;

            case 1:
            	studentService.addStudent(students);
                break;

            case 2:
            	studentService.showAllStudents(students);
                break;

            case 3:
            	studentService.serach(students);
                break;

            case 4:
            	studentService.update(students);
                break;

            case 5:
            	studentService.delete(students);
                break;

            default:
                System.out.println(Message.WRONG_CHOICE);
            }

            System.out.print("\n\n\n");
        }
    }    
}
