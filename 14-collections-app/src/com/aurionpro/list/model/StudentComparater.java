package com.aurionpro.list.model;

import java.util.Comparator;

public class StudentComparater {

	public static class StudentPercentageComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.getPercentage()>o2.getPercentage())
				return 1;
			if(o1.getPercentage()<o2.getPercentage())
				return -1;
			return 0;
		}

	}


	public static class StudentNameComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}


	}

	public static class StudentRollNoComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.getId()>o2.getId())
				return 1;
			if(o1.getId()<o2.getId())
				return -1;
			return 0;
		}

	}


}
