package com.programmingpractise.questions;

/*
 * Java program to check if a given String is palindrome or not.
 */

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		int value = 121;
		isStringPalindrome(str);
		isIntegerPalindrome(value);
	}

	private static void isIntegerPalindrome(int value) {
		// TODO Auto-generated method stub
		int reverse =0;
		int number = value;
		while(number !=0) {
			reverse = reverse*10 + (number%10);
			number = number/10;
		}

		if(reverse != value) {
			System.out.println("is not a palindrome");
		}
		else {
			System.out.println("is a palindrome");
		}

		
	}

	private static void isStringPalindrome(String str) {
		// TODO Auto-generated method stub
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		if (str.equalsIgnoreCase(reverse)) {
			System.out.println("is a palindrome");

		} else {
			System.out.println("is not a palindrome");
		}
	}

}
