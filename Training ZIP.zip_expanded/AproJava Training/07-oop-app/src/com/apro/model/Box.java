package com.apro.model;

public class Box {
	public int width;
	public int height; 
	public int depth;
	
	public Box() {
		super();
	}
	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int w) {
		width = w;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int d) {
		depth = d;
	}
	
}
