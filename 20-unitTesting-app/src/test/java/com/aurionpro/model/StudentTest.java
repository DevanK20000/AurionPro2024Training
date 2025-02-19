package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {
	private IStudentService iStudentService;
	private Student student;

	@BeforeEach
	void init() {
		iStudentService = Mockito.mock(IStudentService.class);
		student = new Student(iStudentService);
	}

	@Test
	void testCalculatePercentage() {
		Mockito.when(iStudentService.getMarks()).thenReturn((double) 650);
		Mockito.when(iStudentService.getNumberOfSubjects()).thenReturn(10);
		
		assertEquals(65.0, student.calculatePercentage());
	}

}
