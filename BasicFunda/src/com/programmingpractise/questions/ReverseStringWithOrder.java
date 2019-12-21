package com.programmingpractise.questions;

public class ReverseStringWithOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I AM NOT A STRING";
		calculateReverseStringWithOrder(input);
	}

	private static void calculateReverseStringWithOrder(String input) {
		// TODO Auto-generated method stub

		int length = input.length();
		String reverse = "";
		int temp = 0;
		char c = ' ';

		while (temp != length) {
			
			for (int i = length - 1; i >= 0; i--) {
				
				
				if (input.charAt(temp) == c) {
					reverse += " ";	}
					else if(input.charAt(i) != c) {
					reverse += input.charAt(i);
					}
				else {
				reverse += input.charAt(i);
				}
				temp++;
		}
				
		System.out.println(input);
		System.out.println(reverse);

	}

	}
}
