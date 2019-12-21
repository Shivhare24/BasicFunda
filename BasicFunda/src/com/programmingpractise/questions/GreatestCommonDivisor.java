package com.programmingpractise.questions;
/*
 * Java program to find the GCD of two number.
 */
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 54, input2 = 24;
		System.out.println(findGCD(input1, input2));
	}

	private static int findGCD(int input1, int input2) {
		// TODO Auto-generated method stub
		if (input2 == 0) {
			return input1;
		} else
			return findGCD(input2, input1 % input2);
	}

}
