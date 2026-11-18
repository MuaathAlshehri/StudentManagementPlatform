package com.studentmanagmentplatform.service;

import java.util.ArrayList;
import com.studentmanagmentplatform.dao.StudentDAO;
import com.studentmanagmentplatform.model.Student;
import com.studentmanagmentplatform.constant.Message;
import com.studentmanagmentplatform.service.Valdiation;

public class StudentService {
	
	StudentDAO studentDao = new StudentDAO();
	Input in = new Input();
	
	public void addStudent(ArrayList<Student> students) {
		
		try {
			String nationalID = Valdiation.valID(Input.getInput(Message.GET_ID_MESSAGE) , students);
			String name = Valdiation.valName(Input.getInput(Message.GET_NAME_MESSAGE));
			int age = Valdiation.valAge(Input.readAge());
			double grade = Valdiation.valGrade(Input.readGrade());
			Student student = new Student(nationalID , name , age , grade);
			studentDao.addStudent(student, students);
			System.out.println("Student added successfully.");
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
	}


}
