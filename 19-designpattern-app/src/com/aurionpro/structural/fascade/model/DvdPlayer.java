package com.aurionpro.structural.fascade.model;

public class DvdPlayer implements IMovieStarter {
	public String movie;
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Turning on DVD Player");
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
		System.out.println("Movie set to: "+this.movie);
	}
	
	
	
}
