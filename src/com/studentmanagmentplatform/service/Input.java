package com.studentmanagmentplatform.service;

import java.util.Scanner;

public class Input {
	
	private static Scanner scn ;
	
	
	public Input() {
		this.scn = new Scanner(System.in);
	}
	
	
    public static  String getInput(String message) {
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
	
    
	public static  double readGrade() {
		System.out.println("Enter student grade: ");
		double grade = scn.nextDouble();
		scn.nextLine();
		
		return grade; 
	}
	
}
