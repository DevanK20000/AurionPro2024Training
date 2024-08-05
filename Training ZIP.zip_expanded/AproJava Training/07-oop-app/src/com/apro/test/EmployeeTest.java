package com.apro.test;

import java.util.Scanner;

import com.apro.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee emp1 = new Employee();
		
		System.out.println("Enter Details of employee1 : ");
		System.out.println("Enter Employee ID : ");
		int id = scanner.nextInt();
		emp1.setEmployeeId(id);
		scanner.nextLine();
		System.out.println("Enter name : ");
		String name = scanner.nextLine();
		emp1.setName(name);
		System.out.println("Enter salary :");
		int salary = scanner.nextInt();
		emp1.setSalary(salary);
		System.out.println("-----------------------");
		Employee emp2 = new Employee();
		System.out.println("Enter Details of employee2 : ");
		System.out.println("Enter Employee ID : ");
		id = scanner.nextInt();
		emp2.setEmployeeId(id);
		scanner.nextLine();
		System.out.println("Enter name : ");
		name = scanner.nextLine();
		emp2.setName(name);
		System.out.println("Enter salary :");
		salary = scanner.nextInt();
		emp2.setSalary(salary);
		
		System.out.println("Details of Employee 1 :");
		System.out.println("Employee Id : "+emp1.getEmployeeId() + " , Name : "+emp1.getName() + " , Salary : "+emp1.getSalary());
		System.out.println("-----------------------");
		System.out.println("Details of Employee 2 :");
		System.out.println("Employee Id : "+emp2.getEmployeeId() + " , Name : "+emp2.getName() + " , Salary : "+emp2.getSalary());
	}

}
