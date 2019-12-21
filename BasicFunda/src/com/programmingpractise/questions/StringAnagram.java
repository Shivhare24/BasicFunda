package com.programmingpractise.questions;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "mary";
		String input2 = "army";
		if(isStringAnagram(input1, input2)) {System.out.println("it's a Anagram");}
		else {System.out.println("It's not a Anagram");}
	}

	private static boolean isStringAnagram(String input1, String input2) {
		// TODO Auto-generated method stub
		char[] arr1 = input1.toCharArray();
		char[] arr2 = input2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			} 
		}
		return true;
		
	}

}
