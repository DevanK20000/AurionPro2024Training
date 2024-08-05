package com.arpro.test;

import java.lang.reflect.Method;

public class ReflectionOfString {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class stringClass= Class.forName("java.lang.String");
		System.out.println(stringClass.getName());
		System.out.println(stringClass.getSimpleName());
		System.out.println(stringClass.getSuperclass());
		
		System.out.println("============Methods============");
		Method methods[] = stringClass.getMethods();
		for (Method method: methods) {
			System.out.println(method.getName()+'\t'+method.getParameterCount());
		}
		}
	

}
