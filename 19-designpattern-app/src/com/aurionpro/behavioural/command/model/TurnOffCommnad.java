package com.aurionpro.behavioural.command.model;

public class TurnOffCommnad implements ICommand {
	
	private IDevice device;
	
	
	
	public TurnOffCommnad(IDevice device) {
		super();
		this.device = device;
	}



	@Override
	public void execute() {
		// TODO Auto-generated method stub
		device.turnOff();
	}

}