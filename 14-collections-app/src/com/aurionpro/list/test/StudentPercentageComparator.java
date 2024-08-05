package com.aurionpro.list.test;

import java.util.Comparator;

import com.aurionpro.list.model.Student;

public class StudentPercentageComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getPercentage()>o2.getPercentage())
			return 1;
		if(o1.getPercentage()<o2.getPercentage())
			return -1;
		return 0;
	}

}
