package com.aurionpro.behavioural.state.model;

public class PacketStateShiped implements IPacketState {

	
	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet moved to delivered state");
		packet.setPacketState(new PacketStateDelivered());
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet moved to shiped state");
		packet.setPacketState(new PacketStateOrdered());
	}

	@Override
	public void currnet(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is in shipped state");

	}

}