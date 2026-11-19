package com.studentmanagmentplatform.util;

import com.studentmanagmentplatform.model.Student;
import java.util.ArrayList;

public class InputValidator {
	
	public static int validateAge(int age) {
		
		if(age < 0 || age > 130) {
			throw new IllegalArgumentException("Age should be more than 0 and less 130");
		}
		
		return age ;
		
	}
	
	
	public static double validateGrade(double grade) {
		
		if(grade < 0 || grade > 100) {
			throw new IllegalArgumentException("Grade should br more 0 and less 101");
		}
		
		return grade ; 
	}
	
	public static String validateString(String name) {
		
		if(name.isBlank()) {
			throw new IllegalArgumentException("The text shouldn't be null or whitespaces");
		}
		
		return name ; 
	}
	
	
	public static String isIdExits(String ID , ArrayList<Student> students) {
		
		for(Student student : students) {
			if(student.getNationalId().equals(ID)) {
				throw new IllegalArgumentException("This ID already exits");
			}
		}
		return ID ; 
	}
}
