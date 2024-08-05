package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		System.out.println(list);
		System.out.println(list.size());
		
		list.add("chirag");
		list.add("Devan");
		
		System.out.println(list);
		
		list.add(1, "darshan");
		System.out.println(list);
		
		list.set(1, 51);
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("chirag");
		list2.add("Pranay");
		list2.add("neha");
		
		System.out.println("Using normal for loop");
		for(int i=0;i<list2.size();i++)
			System.out.println(list2.get(i));
		
		System.out.println("Using advance for loop");
		for(String name:list2)
			System.out.println(name);
		
		System.out.println("Using iterator");
		Iterator<String> iterator = list2.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("Using list Iterator");
		ListIterator<String> listIterator = list2.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
	}

}
