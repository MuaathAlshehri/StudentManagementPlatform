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
			String nationalID = Valdiation.valID(Input.getInput(Message.GET_ID_MESSAGE), students);
			String name = Valdiation.valText(Input.getInput(Message.GET_NAME_MESSAGE));
			int age = Valdiation.valAge(Input.readAge());
			double grade = Valdiation.valGrade(Input.readGrade());
			
			Student student = new Student(nationalID, name, age, grade);
			
			studentDao.addStudent(student, students);
			
			System.out.println("Student added successfully.");
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	
	public void showAllStudents(ArrayList<Student> students) {
		if (students.size() == 0) {
			System.out.println("\nNo students found!");
		} else {
			students.forEach(student -> {
				student.show();
				System.out.println("\n");
			});
		}
	}

	public void serach(ArrayList<Student> students) {
		
		String nationalID = Valdiation.valText(Input.getInput(Message.GET_ID_MESSAGE));
		
		Student st1 = studentDao.serachStudent(nationalID, students);
		
		if (st1 != null) {
		    st1.show();
		} else {
		    System.out.println("Student not found!");
		}
	}
	


	public void update(ArrayList<Student> students) {

		String nationalID = Valdiation.valText(Input.getInput(Message.GET_ID_MESSAGE));
		Student student = studentDao.serachStudent(nationalID, students);
		
		if(student == null) {
			
			System.out.println("\nStudent Not found");
			
		}else {
			
			try {
				String name = Valdiation.valText(Input.getInput(Message.GET_NAME_MESSAGE));
				int age = Valdiation.valAge(Input.readAge());
				double grade = Valdiation.valGrade(Input.readGrade());
				
				student.setName(name);
				student.setAge(age);
				student.setGrade(grade);
				
				System.out.println("Update done");

				
			}catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}	
		}
    }

	
	public void delete(ArrayList<Student> students) {
		
		String nationalID = Valdiation.valText(Input.getInput(Message.GET_ID_MESSAGE));
		Student student = studentDao.serachStudent(nationalID, students);
		
		if(student == null) {
			System.out.println("\nStudent Not found");
		}else {	
			studentDao.deleteStudent(student, students);
			System.out.println("Student deleted successfully.");
		}
	}


}