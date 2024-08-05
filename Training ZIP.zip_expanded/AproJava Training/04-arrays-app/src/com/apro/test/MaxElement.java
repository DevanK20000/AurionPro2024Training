package com.apro.test;

import java.util.Scanner;

public class MaxElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter your array numbers :");
		for(int i =0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int element : arr) {
			if(element>max) {
				max=element;
			}
		}
		System.out.println("Maximum element of Array is : "+max);
	}
}
