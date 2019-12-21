package com.programmingpractise.questions;
/*
 * java program to find factorial of a number
 */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;
		System.out.println(recursiveFactorial(input));
		System.out.println(iterativeFactorial(input));

	}
	
	/*
	 * Using Recursion
	 */
	private static int recursiveFactorial(int input) {
		// TODO Auto-generated method stub
		if(input ==0) {
			return 1;
		}
		else 
			return input * recursiveFactorial(input -1);
		
	}
	
	/*
	 * using Iteration
	 */
	private static int iterativeFactorial(int input) {
		int number =1;
		while(input !=0) {
			number = number*input;
			input --;
		}
		return number;
	}
}