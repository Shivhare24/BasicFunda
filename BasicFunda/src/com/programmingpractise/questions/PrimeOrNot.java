package com.programmingpractise.questions;



public class PrimeOrNot {

	public static void main(String[] args) {
		
		int i = 91;
		if(i==0) System.out.println("please provide value greater than 0");
		if (i > 1) {
			if (i % 2 != 0) {
				if(i % 3 != 0) {
					if(i % 5 != 0) {
						if(i % 7 != 0) {
							System.out.println("It's a prime");
						}
					}
				}
			}
		}
		
		else System.out.println("Not a Prime");
	
	}
}
