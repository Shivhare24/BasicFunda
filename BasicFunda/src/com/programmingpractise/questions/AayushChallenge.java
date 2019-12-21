package com.programmingpractise.questions;

public class AayushChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "010100110101011";
		groupCount(s);
	}

	private static void groupCount(String s) {
	
		StringBuilder str = new StringBuilder(s);
		int count =0;
		for(int i =0; i<str.length(); i++) {
			if((str.charAt(i) == '0') && (str.charAt(i+1)== '1') && (str.charAt(i+2) =='0')){
				str.replace(i, i+2, "A");
				count++;
			}
		}
		System.out.println(count);
	}

}
