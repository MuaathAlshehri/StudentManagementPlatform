package com.studentmanagmentplatform.dao;

import java.util.ArrayList;

import com.studentmanagmentplatform.model.Student;

public class StudentDAO {
	
	
	
	public void addStudentToArrayList(Student student , ArrayList<Student> students) {
		students.add(student);
	}
	
	public void deleteStudentToArrayList(Student student  , ArrayList<Student> students ) {
		students.remove(student);
	}
	
	
	public Student serachStudentInArrayList(String ID , ArrayList<Student> students) {
    	
    	for(Student student : students) {
    		if(student.getNationalId().equals(ID)) {
    			return student ;
    		}
    	}
    	
    	return null ; 
	}
	

	
	
}
