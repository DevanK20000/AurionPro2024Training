package com.aurionpro.list.model;

import java.util.Comparator;

public class EmployeeComparator {
	public static class EmployeeIdComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmployeeId().compareTo(o2.getEmployeeId());
		}
		
	}
	
	public static class EmployeeNameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}}

	public static class EmployeeSalaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getSalary().compareTo(o2.getSalary());
		}}

}
