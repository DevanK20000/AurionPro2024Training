package com.aurionpro.test;

public class ThreadTest {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		thread.setName("MyThread");
		System.out.println(thread);
		
		for(int i=0;i<5;i++) {
			try {
				System.out.println(Thread.currentThread().getName()+":"+i);
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
