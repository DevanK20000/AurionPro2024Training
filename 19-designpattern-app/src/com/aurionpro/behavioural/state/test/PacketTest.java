package com.aurionpro.behavioural.state.test;

import com.aurionpro.behavioural.state.model.Packet;

public class PacketTest {
	public static void main(String[] args) {
		Packet packet = new Packet();
		
		packet.currentState();
		packet.nextState();
		packet.nextState();
		packet.nextState();
		packet.currentState();
		
		packet.previousState();
		packet.currentState();
		packet.previousState();
		packet.previousState();
	}
}
