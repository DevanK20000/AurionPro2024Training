package com.aurionpro.list.test;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Vinauak");
		linkedList.add("devan");
		linkedList.add("prasd");
		System.out.println(linkedList);
		
		linkedList.addFirst("halt");
		System.out.println(linkedList);
		
		linkedList.addLast("last");
		System.out.println(linkedList);
	}

}
