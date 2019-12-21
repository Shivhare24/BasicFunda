package com.programmingpractise.questions;

public class ReverseString {

	public static void main(String[] args) {
		//Using String
		String s1 = "shubham";
		for(int i=s1.length()-1; i>=0; i--)
		System.out.print(s1.charAt(i));
		System.out.println();
		
		//Using CharacterArray
		String s2 =  new String();
		char[] ch = s1.toCharArray();
		for(int i=s1.length()-1; i>=0; i--)
		s2 +=ch[i];
		System.out.println(s2);
		
		//Using StringBuffer
		StringBuffer sb1 = new StringBuffer(s1);
		System.out.println(sb1.reverse());

		//Using StringBuilder
		StringBuilder sb2 = new StringBuilder(s1);
		System.out.println(sb2.reverse());
	}

}
