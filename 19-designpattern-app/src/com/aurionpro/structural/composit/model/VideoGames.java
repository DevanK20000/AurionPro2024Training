package com.aurionpro.structural.composit.model;

public class VideoGames extends Product {
	public VideoGames(String title,Double price) {
		super(title,price);
	}
	@Override
	public Double calculatePrice() {
		// TODO Auto-generated method stub
		return getPrice();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(getTitle()+"\t"+getPrice());
		
	}
}