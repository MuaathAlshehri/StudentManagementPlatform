package com.studentmanagmentplatform.service;

import java.util.ArrayList;
import com.studentmanagmentplatform.dao.StudentDAO;
import com.studentmanagmentplatform.model.Student;
import com.studentmanagmentplatform.util.InputHandler;
import com.studentmanagmentplatform.util.InputValidator;
import com.studentmanagmentplatform.constant.Message;

public class StudentService {

	StudentDAO studentDao = new StudentDAO();
	InputHandler in = new InputHandler();

	public void addStudentService(ArrayList<Student> students) {

		try {
			String nationalID = InputValidator.isIdExits(InputHandler.readString(Message.GET_ID_MESSAGE), students);
			String name = InputValidator.validateString(InputHandler.readString(Message.GET_NAME_MESSAGE));
			int age = InputValidator.validateAge(InputHandler.readAge());
			double grade = InputValidator.validateGrade(InputHandler.readGrade());
			
			Student student = new Student(nationalID, name, age, grade);
			
			studentDao.addStudentToArrayList(student, students);
			
			System.out.println("Student added successfully.");
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	
	public void showAllStudentsService(ArrayList<Student> students) {
		if (students.size() == 0) {
			System.out.println("\nNo students found!");
		} else {
			students.forEach(student -> {
				student.show();
				System.out.println("\n");
			});
		}
	}

	public void serachService(ArrayList<Student> students) {
		
		String nationalID = InputValidator.validateString(InputHandler.readString(Message.GET_ID_MESSAGE));
		
		Student st1 = studentDao.serachStudentInArrayList(nationalID, students);
		
		if (st1 != null) {
		    st1.show();
		} else {
		    System.out.println("Student not found!");
		}
	}
	


	public void updateService(ArrayList<Student> students) {

		String nationalID = InputValidator.validateString(InputHandler.readString(Message.GET_ID_MESSAGE));
		Student student = studentDao.serachStudentInArrayList(nationalID, students);
		
		if(student == null) {
			
			System.out.println("\nStudent Not found");
			
		}else {
			
			try {
				String name = InputValidator.validateString(InputHandler.readString(Message.GET_NAME_MESSAGE));
				int age = InputValidator.validateAge(InputHandler.readAge());
				double grade = InputValidator.validateGrade(InputHandler.readGrade());
				
				student.setName(name);
				student.setAge(age);
				student.setGrade(grade);
				
				System.out.println("Update done");

				
			}catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}	
		}
    }

	
	public void deleteService(ArrayList<Student> students) {
		
		String nationalID = InputValidator.validateString(InputHandler.readString(Message.GET_ID_MESSAGE));
		Student student = studentDao.serachStudentInArrayList(nationalID, students);
		
		if(student == null) {
			System.out.println("\nStudent Not found");
		}else {	
			studentDao.deleteStudentToArrayList(student, students); 
			System.out.println("Student deleted successfully.");
		}
	}


}