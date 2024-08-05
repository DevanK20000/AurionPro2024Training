package com.aurionpro.structural.fascade.model;

public class MovieFacde {
	DvdPlayer dvdPlayer = new DvdPlayer();
	SoundSystem soundSystem = new SoundSystem();
	Projector projector = new Projector();
	
	
	public void watchMovie() {
		dvdPlayer.on();
		dvdPlayer.setMovie("DP");
		
		soundSystem.on();
		soundSystem.setVolume(7);
		
		projector.on();
	}
	
	public void displayStatus() {
	}
}
