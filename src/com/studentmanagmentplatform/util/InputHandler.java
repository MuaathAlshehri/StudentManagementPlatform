package com.studentmanagmentplatform.util;

import java.util.Scanner;

public class InputHandler {
	
	private static Scanner scn ;
	
	
	public InputHandler() {
		scn = new Scanner(System.in);
	}
	
	
    public static  String readString(String message) {
        System.out.println(message);
        String name = scn.nextLine();

        return name;
    }
    
    
    public static int readAge() {
		System.out.println("Enter student age: ");
		int age = scn.nextInt();
		scn.nextLine();
		
		return age ;
	}
	
    
	public static double readGrade() {
		System.out.println("Enter student grade: ");
		double grade = scn.nextDouble();
		scn.nextLine();
		
		return grade; 
	}
	
	
	public static int readChioce() {
		System.out.print("Enter your choice: ");
        int choice = scn.nextInt();
        scn.nextLine();
        return choice ;
	}
}
