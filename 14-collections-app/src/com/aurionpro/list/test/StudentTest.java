package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import com.aurionpro.list.model.Student;
import com.aurionpro.list.model.StudentComparater;
import com.aurionpro.list.model.StudentRollNoComparator;

public class StudentTest {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter no of students:");
	int noOfStudents= scanner.nextInt();
	
	ArrayList<Student> students = new ArrayList<Student>();
	for(int i=0; i<noOfStudents;i++){
		System.out.println("Enter id: ");
	    int id = scanner.nextInt();
	    System.out.println("Enter name: ");
	    scanner.nextLine();
	    String name = scanner.nextLine();
	    System.out.println("Enter percentage: ");
	    double percentage = scanner.nextDouble();
	    students.add(new Student(id, name, percentage));
	}	
	
	System.out.println("\nUnsorted");
	for(Student student:students) {
		System.out.println(student);
	}
	
	System.out.println("\nSorted on roll no");
	Collections.sort(students,new StudentComparater.StudentRollNoComparator());
	
	for(Student student:students) {
		System.out.println(student);
	}	
	
	System.out.println("\nSorted on name");
	Collections.sort(students,new StudentComparater.StudentNameComparator());
	
	for(Student student:students) {
		System.out.println(student);
	}
	
	System.out.println("\nSorted on percentage");
	Collections.sort(students,new StudentComparater.StudentPercentageComparator());
	
	for(Student student:students) {
		System.out.println(student);
	}	
}
}
