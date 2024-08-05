package com.aurionpro.behavioural.state.model;

public class PacketStateDelivered implements IPacketState{

	
	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.err.println("No next state");
		
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet moved to shiped state");
		packet.setPacketState(new PacketStateShiped());
	}

	@Override
	public void currnet(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packed is in delivered state");
		
	}

}