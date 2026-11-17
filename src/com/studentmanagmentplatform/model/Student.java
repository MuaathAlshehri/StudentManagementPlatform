package com.studentmanagmentplatform.model;

public class Student {

    private String nationalId;
    private String name;
    private int age;
    private double grade;

    public Student(String nationalId, String name, int age, double grade) {
        this.nationalId = nationalId;
        this.setName(name);
        this.setAge(age);
        this.setGrade(grade);
    }

    public void setName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("\nName cannot be null or empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 7 || age > 60) {
            throw new IllegalArgumentException("\nAge must be between 7 and 60");
        }
        this.age = age;
    }

    public void setGrade(double grade) {

        if (!Double.isFinite(grade) || grade < 0 || grade > 100) {
            throw new IllegalArgumentException("\nNumber cannot be negative or over 100");
        }

        this.grade = grade;
    }

    public String getNationalId() {
        return nationalId;
    }
    
    public double getGrade() {
    	return this.grade;
    }
    public String isPassed() {
        if (this.grade >= 60) {
            return "Passed";
        }
        return "Failed";
    }

    public String hisGrade() {
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
    }

    public void show() {
        System.out.println("The student name: " + this.name + "\nNational ID: " + this.nationalId + "\nAge: " + this.age
                + "\nGrade: " + this.grade + "\nHis status: " + this.isPassed() + "\nHis grade in writing: "
                + this.hisGrade());
    }
}
