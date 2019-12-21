package com.spring.demo;

public class Point {

	int x;
	int y;
	
	@SuppressWarnings("rawtypes")
	Class c = Point.class;
	
	public void init() {
		System.out.println("bean initialized with " + c.getName() );
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
