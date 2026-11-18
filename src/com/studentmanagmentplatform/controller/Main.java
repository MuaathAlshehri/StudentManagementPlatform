package com.studentmanagmentplatform.controller;


import java.util.ArrayList;

import java.util.Scanner;

import com.studentmanagmentplatform.constant.Message;
import com.studentmanagmentplatform.model.Student;
import com.studentmanagmentplatform.service.StudentService;
import com.studentmanagmentplatform.constant.Message ;
import com.studentmanagmentplatform.service.Input;


public class Main {

    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
    	
    	StudentService studentService = new StudentService();
        ArrayList<Student> students = new ArrayList<>();

        boolean flag = true;

        while (flag) {

            Message.showMenu();
            
            int input = in.nextInt();
            in.nextLine();

            System.out.print("\n\n\n");

            switch (input) {
            case 0:
                System.out.println("Thank you for using my system :)");
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
                System.out.println("You didn't choose correct choice , try again");
            }

            System.out.print("\n\n\n");
        }
    }    
}
