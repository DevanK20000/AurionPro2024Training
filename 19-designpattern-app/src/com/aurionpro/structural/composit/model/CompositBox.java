package com.aurionpro.structural.composit.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositBox implements IBox {
	private final List<IBox> children = new ArrayList<>();
	
	public CompositBox(IBox... boxes) {
		children.addAll(Arrays.asList(boxes));
	}



	@Override
	public Double calculatePrice() {
		// TODO Auto-generated method stub
		return children.stream()
					   .mapToDouble(IBox::calculatePrice)
					   .sum();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Composit Box");
		children.stream().forEach(IBox::display);
	}
}
