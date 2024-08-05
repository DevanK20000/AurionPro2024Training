package com.aurionpro.list.test;

import java.util.ArrayList;

import com.aurionpro.list.model.Employee;
import com.aurionpro.list.model.EmployeeComparator;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(4, "das", 50000.0));
		employees.add(new Employee(7, "tasta", 45000.0));
		employees.add(new Employee(2, "mang", 70000.0));
		employees.add(new Employee(10, "ck", 60000.0));
		
		System.out.println("Unsorted: ");
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
		employees.sort(new EmployeeComparator.EmployeeIdComparator());
		System.out.println("Sorted by id: ");
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		employees.sort(new EmployeeComparator.EmployeeNameComparator());
		System.out.println("Sorted by name: ");
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		employees.sort(new EmployeeComparator.EmployeeSalaryComparator());
		System.out.println("Sorted by Salary: ");
		for(Employee employee:employees) {
			System.out.println(employee);
		}
	}

}
