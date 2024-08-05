package com.aurionpro.behavioural.state.model;

public class PacketStateOrdered implements IPacketState {

	
	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet moved to shiped state");
		packet.setPacketState(new PacketStateShiped());
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.err.println("No previous state");
	}

	@Override
	public void currnet(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("packet is in Ordered state");
	}

}
