package com.aurionpro.isp.model;

public class Labour implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour has started working");
	}

	@Override
	public void endWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour has stoped working");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Labour is eating");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Labour is drinking");

	}

}