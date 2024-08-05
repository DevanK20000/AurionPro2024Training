package com.aurionpro.sets.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		TreeSet<String> treeSet = new TreeSet<String>();
		set.add("Kaivalya");
		set.add("Mrunalini");
		set.add("Shivam");
		set.add("Chirag");
		set.add("Chirag");
		
		linkedHashSet.add("Kaivalya");
		linkedHashSet.add("Mrunalini");
		linkedHashSet.add("Shivam");
		linkedHashSet.add("Chirag");
		linkedHashSet.add("Chirag");
		
		treeSet.add("Kaivalya");
		treeSet.add("Mrunalini");
		treeSet.add("Shivam");
		treeSet.add("Chirag");
		treeSet.add("Chirag");
		
		System.out.println(set);
		System.out.println(linkedHashSet);
		System.out.println(treeSet);
		//Hash set does not maintain any order
		//Linked hash set maintains the insertion oder of the elements
		//Tree set is ascending sorted order 
	}

}
