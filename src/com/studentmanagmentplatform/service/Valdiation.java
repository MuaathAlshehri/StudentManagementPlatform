package com.studentmanagmentplatform.service;

public class Valdiation {
	
	public static int valAge(int age) {
		
		if(age < 0 || age > 130) {
			throw new IllegalArgumentException("Age should be more than 0 and less 130");
		}
		
		return age ;
		
	}
	
	
	public static double valGrade(double grade) {
		
		if(grade < 0 || grade > 100) {
			throw new IllegalArgumentException("Grade should br more 0 and less 101");
		}
		
		return grade ; 
	}
	
	public static String valnameOrID(String nameOrID) {
		
		if(nameOrID.isBlank()) {
			throw new IllegalArgumentException("The shouldn't be null or whitespaces");
		}
		
		return nameOrID ; 
	}
}
