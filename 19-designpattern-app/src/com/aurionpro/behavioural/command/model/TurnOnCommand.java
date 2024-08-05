package com.aurionpro.behavioural.command.model;

public class TurnOnCommand implements ICommand{
	private IDevice device;
	
	

	public TurnOnCommand(IDevice device) {
		super();
		this.device = device;
	}



	@Override
	public void execute() {
		// TODO Auto-generated method stub
		device.turnOn();
	}

}
