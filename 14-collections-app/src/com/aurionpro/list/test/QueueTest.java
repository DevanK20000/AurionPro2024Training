package com.aurionpro.list.test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        System.out.println(queue);
        
        System.out.println(queue.remove());
        System.out.println(queue);
        
        System.out.println(queue.peek());
        System.out.println(queue);
        
	}

}
