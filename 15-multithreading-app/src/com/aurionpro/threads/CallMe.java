package com.aurionpro.threads;

public class CallMe {
	public synchronized void call(String message) {
		System.out.print("["+message);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
