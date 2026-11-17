package com.studentmanagmentplatform.service;

import java.util.ArrayList;

import com.studentmanagmentplatform.dao.StudentDAO;
import com.studentmanagmentplatform.model.Student;


public class StudentService {
	
	StudentDAO studentDao = new StudentDAO();
	
	
	public void addStudent(Student student , ArrayList<Student> students) {
		
		student.setGrade(student.getGrade() + 10);
		
		studentDao.addStudent(student , students);
		
	}



}
