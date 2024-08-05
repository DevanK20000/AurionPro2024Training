package com.aurionpro.isp.test;

import com.aurionpro.isp.model.IWorkable;
import com.aurionpro.isp.model.IWorker;
import com.aurionpro.isp.model.Labour;
import com.aurionpro.isp.model.Robot;

public class Worker {
	public static void main(String[] args) {
		IWorker labour = new Labour();
		labour.startWork();
		labour.endWork();
		labour.eat();
		labour.drink();
		
		IWorkable robot = new Robot();
		robot.startWork();
		robot.endWork();
	}
}
