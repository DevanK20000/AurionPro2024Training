package com.aurionpro.structural.adapter.model;

public class HatAdapter implements IItem{
	private Hat hat;
	

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		
		return hat.getShortName()+" "+hat.getLongName();
	}

	@Override
	public Double getItemPrice() {
		// TODO Auto-generated method stub
		return ((hat.getTax()/100)*hat.getBasicPrice())+hat.getBasicPrice();
	}

}
