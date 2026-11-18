package com.studentmanagmentplatform.constant;

public class Message {
	
    public static final String GET_NAME_MESSAGE = "Enter the student name: ";
    public static final String GET_ID_MESSAGE = "Enter the student ID: ";
    
    
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
    
}
