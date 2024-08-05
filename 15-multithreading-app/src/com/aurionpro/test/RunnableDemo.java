package com.aurionpro.test;

import com.aurionpro.threads.RunnableThread;

public class RunnableDemo {
	public static void main(String[] args) {
		RunnableThread runnableThread = new RunnableThread("thread1");
		System.out.println(runnableThread.getThread().isAlive());
		try {
			runnableThread.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(runnableThread.getThread().isAlive());
	}

}
