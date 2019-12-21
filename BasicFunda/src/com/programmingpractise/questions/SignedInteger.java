package com.programmingpractise.questions;


public class SignedInteger {

	public static void main(String[] args) {
		SignedInteger si = new SignedInteger();
		if (si.oppositeSign(3, -8)) {
			System.out.println("numbers are same");
		}
		else
		System.out.println("numbers are different");
		

	}
	
	boolean oppositeSign(int x, int y) {
		
		return (x ^ y) > 0;
	}

}
