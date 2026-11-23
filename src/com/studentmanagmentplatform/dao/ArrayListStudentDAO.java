package com.studentmanagmentplatform.dao;

import java.util.ArrayList;
import com.studentmanagmentplatform.model.Student;


public class ArrayListStudentDAO implements StudentDAO{

	private ArrayList<Student> students = new ArrayList<Student>();
	
	@Override
	public void addStudent(Student student) {
		students.add(student);
	}
	
	@Override
	public void deleteStudent(Student student ) {
		students.remove(student);
	}
	
	@Override
	public Student serachStudent(String ID) {
		for(Student student : students) {
			if(student.getNationalId().equals(ID)) {
				return student;
			}
		}
		
		return null;
	}
	
	@Override
	public ArrayList<Student> getAllStudents(){
		return students;
	}
	
	
	@Override
	public void updateStudent(Student student) {
		
	}
}
