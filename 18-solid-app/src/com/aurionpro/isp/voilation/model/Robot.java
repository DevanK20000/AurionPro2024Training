package com.aurionpro.isp.voilation.model;


public class Robot implements IWorker {

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

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Robot is eating");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Robot is drinking");

	}

}
