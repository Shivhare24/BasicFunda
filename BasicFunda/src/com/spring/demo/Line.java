package com.spring.demo;

public class Line {

	public Point pointA;
	public Point pointB;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	@Override
	public String toString() {
		return "Line [pointA=" + pointA + ", pointB=" + pointB + "]";
	}
	
	
	
}
