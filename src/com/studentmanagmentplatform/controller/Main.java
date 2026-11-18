package com.studentmanagmentplatform.controller;

import com.studentmanagmentplatform.service.Input;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.Scanner;

import com.studentmanagmentplatform.constant.Message;
import com.studentmanagmentplatform.model.Student;
import com.studentmanagmentplatform.service.StudentService;
import com.studentmanagmentplatform.constant.Message ;


public class Main {

    static Scanner in = new Scanner(System.in);
    static HashSet<String> nationalIDs = new HashSet<>();

    
    
    static StudentService studentService = new StudentService();

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        boolean flag = true;

        while (flag) {

            showMenu();
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
            	studentService.serach(students, Input.getInput(Message.GET_ID_MESSAGE));
                break;

            case 4:
            	studentService.update(students, Input.getInput(Message.GET_ID_MESSAGE));
                break;

            case 5:
                String nationalid = Input.getInput(Message.GET_ID_MESSAGE);
                delete(students, nationalid);
                break;

            default:
                System.out.println("You didn't choose correct choice , try again");
            }

            System.out.print("\n\n\n");
        }
    }

    public static void showMenu() {
        System.out.println("===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. Show All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }    


    
    

    public static void delete(ArrayList<Student> students, String nationalID) {

        if (checker(nationalID)) {

            nationalIDs.remove(nationalID);

            boolean removed = students.removeIf(student -> student.getNationalId().equals(nationalID));

            if (removed) {
                System.out.println("\nDelete was Successfully");
            }
        } else {
            System.out.println("\nStudent Not Found");
        }
    }

    public static boolean checker(String national_id) {
        if (nationalIDs.contains(national_id)) {
            return true;
        }
        return false;
    }

    

}
