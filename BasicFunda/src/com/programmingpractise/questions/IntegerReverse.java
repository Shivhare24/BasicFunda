package com.programmingpractise.questions;
/*
 * Java program to reverse an integer
 */
public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 54321;
		int reverse =0;
		while(input!=0) {
			reverse=reverse*10+input%10;
			input=input/10;
		}
		System.out.println(reverse);
	}

}
