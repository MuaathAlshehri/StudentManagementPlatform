package com.studentmanagmentplatform.service;

import com.studentmanagmentplatform.model.Student;
import java.util.ArrayList;

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
	
	public static String valText(String name) {
		
		if(name.isBlank()) {
			throw new IllegalArgumentException("The text shouldn't be null or whitespaces");
		}
		
		return name ; 
	}
	
	
	public static String valID(String ID , ArrayList<Student> students) {
		
		for(Student student : students) {
			if(student.getNationalId().equals(ID)) {
				throw new IllegalArgumentException("This ID already exits");
			}
		}
		return ID ; 
	}
}
