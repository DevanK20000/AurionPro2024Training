package com.aurionpro.list.model;

import java.util.Comparator;

public class StudentRollNoComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getId()>o2.getId())
			return 1;
		if(o1.getId()<o2.getId())
			return -1;
		return 0;
	}

}
