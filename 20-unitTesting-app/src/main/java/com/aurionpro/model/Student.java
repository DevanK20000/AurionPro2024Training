package com.aurionpro.model;

public class Student {
	private IStudentService studentService;
	
	
	public Student(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}


	public double calculatePercentage() {
		return (double) (studentService.getMarks()*studentService.getNumberOfSubjects())/100;
	}
}
