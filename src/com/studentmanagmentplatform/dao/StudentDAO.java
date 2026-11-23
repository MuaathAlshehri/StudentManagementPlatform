package com.studentmanagmentplatform.dao;


import java.util.ArrayList;
import com.studentmanagmentplatform.model.Student;

public interface StudentDAO {

	public void addStudent(Student student);
	
	public void deleteStudent(Student student );	
	
	public Student serachStudent(String ID);

	public ArrayList<Student> getAllStudents();
	
	public void updateStudent(Student student);
	
}
