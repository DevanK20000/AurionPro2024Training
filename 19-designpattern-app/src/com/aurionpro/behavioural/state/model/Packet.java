package com.aurionpro.behavioural.state.model;

public class Packet {
	private IPacketState packetState;

	public Packet() {
		super();
		this.packetState = new PacketStateOrdered();
	}

	public IPacketState getPacketState() {
		return packetState;
	}

	public void setPacketState(IPacketState packetState) {
		this.packetState = packetState;
	}
	
	public void nextState() {
		packetState.next(this);
	}
	
	public void previousState() {
		packetState.previous(this);
	}
	
	public void currentState() {
		packetState.currnet(null);
	}
	
	
	
}
