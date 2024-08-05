package com.techlab.model;

public class Box {
	private int height;
	private int width;
	private int depth;
	public Box(int height,int widht, int depth) {
		this.width = widht;
		this.depth = depth;
		this.height = height;
	}
	public int getWidht() {
		return width;
	}
	public void setWidht(int widht) {
		this.width = widht;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	

}
