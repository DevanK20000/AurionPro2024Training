package com.aurionpro.isp.model;


public class Robot implements IWorkable {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot has started working");
	}

	@Override
	public void endWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot has stoped working");
	}

}
