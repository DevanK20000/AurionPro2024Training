package com.aurionpro.structural.fascade.model;

public class SoundSystem implements IMovieStarter {
	private Integer volume;
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Turning on Sound System");
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
		System.out.println("Volume set to: "+this.volume);
	}

}
