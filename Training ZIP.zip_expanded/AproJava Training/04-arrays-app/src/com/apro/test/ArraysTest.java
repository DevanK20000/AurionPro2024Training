package com.apro.test;

import java.util.Scanner;

public class ArraysTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter your array numbers :");
		for(int i =0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int element:arr) {
			System.out.print(element+ "\t");
		}
	}
}
