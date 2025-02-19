package com.aurionpro.threads;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("MyThread1");
		MyThread thread2 = new MyThread("MyThread2");
		MyThread thread3 = new MyThread("MyThread3");
		
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
		
		for(int i =5;i>0;i--) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		System.out.println(thread3.isAlive());
	}

}
