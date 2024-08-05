package com.aurionpro.map.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		map.put(5, "chirag");
		map.put(4, "shirish");
		map.put(7, "Vinayak");

		linkedMap.put(5, "chirag");
		linkedMap.put(4, "shirish");
		linkedMap.put(7, "Vinayak");

		treeMap.put(5, "chirag");
		treeMap.put(4, "shirish");
		treeMap.put(7, "Vinayak");
		
		System.out.println(map);
		System.out.println(linkedMap);
		System.out.println(treeMap);
		//Hash map maintains random order and can contain one null key and many null values
		//liked map maintains insertion order
		//tree map maintains ascending order and cannot contain null value as key
	
		Set<Entry<Integer, String>> entries = treeMap.entrySet();
		
		for(Entry<Integer, String> entry:entries) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}
}
