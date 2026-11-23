
package com.studentmanagmentplatform.model;

import com.studentmanagmentplatform.constant.Message;

public class Student {

	private String nationalId;
	private String name;
	private int age;
	private double grade;

	public Student(String nationalId, String name, int age, double grade) {

		System.out.println(Message.STUDENT_CONSTRUCTOR_ENTER);

		this.nationalId = nationalId;
		this.name = name;
		this.age = age;
		this.grade = grade;

		System.out.println(Message.STUDENT_CONSTRUCTOR_EXIT);
	}

	public Student() {

		System.out.println(Message.STUDENT_CONSTRUCTOR_ENTER);

		System.out.println(Message.STUDENT_CONSTRUCTOR_EXIT);
	}

	public void setName(String name) {

		System.out.println(Message.STUDENT_SET_NAME_ENTER);

		this.name = name;

		System.out.println(Message.STUDENT_SET_NAME_EXIT);
	}

	public void setAge(int age) {

		System.out.println(Message.STUDENT_SET_AGE_ENTER);

		this.age = age;

		System.out.println(Message.STUDENT_SET_AGE_EXIT);
	}

	public void setGrade(double grade) {

		System.out.println(Message.STUDENT_SET_GRADE_ENTER);

		this.grade = grade;

		System.out.println(Message.STUDENT_SET_GRADE_EXIT);
	}

	public String getNationalId() {

		System.out.println(Message.STUDENT_GET_ID_ENTER);

		try {
			return nationalId;
		} finally {
			System.out.println(Message.STUDENT_GET_ID_EXIT);
		}
	}

	public double getGrade() {

		System.out.println(Message.STUDENT_GET_GRADE_ENTER);

		try {
			return this.grade;
		} finally {
			System.out.println(Message.STUDENT_GET_GRADE_EXIT);
		}
	}

	public String getName() {

		System.out.println(Message.STUDENT_GET_NAME_ENTER);

		try {
			return this.name;
		} finally {
			System.out.println(Message.STUDENT_GET_NAME_EXIT);
		}
	}

	public int getAge() {

		System.out.println(Message.STUDENT_GET_AGE_ENTER);

		try {
			return this.age;
		} finally {
			System.out.println(Message.STUDENT_GET_AGE_EXIT);
		}
	}

	public String isPassed() {

		System.out.println(Message.STUDENT_IS_PASSED_ENTER);

		try {
			if (this.grade >= 60) {
				return "Passed";
			}

			return "Failed";

		} finally {
			System.out.println(Message.STUDENT_IS_PASSED_EXIT);
		}
	}

	public String hisGrade() {

		System.out.println(Message.STUDENT_HIS_GRADE_ENTER);

		try {
			if (this.grade >= 90) {
				return "Excellent";
			} else if (this.grade >= 80) {
				return "Very Good";
			} else if (this.grade >= 70) {
				return "Good";
			} else if (this.grade >= 60) {
				return "Pass";
			} else {
				return "Fail";
			}

		} finally {
			System.out.println(Message.STUDENT_HIS_GRADE_EXIT);
		}
	}

	public void show() {

		System.out.println(Message.STUDENT_SHOW_ENTER);

		try {
			System.out.println("The student name: " + this.name + "\nNational ID: " + this.nationalId + "\nAge: "
					+ this.age + "\nGrade: " + this.grade + "\nHis status: " + this.isPassed()
					+ "\nHis grade in writing: " + this.hisGrade());

		} finally {
			System.out.println(Message.STUDENT_SHOW_EXIT);
		}
	}
}
