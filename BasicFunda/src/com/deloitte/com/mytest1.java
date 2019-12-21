package com.deloitte.com;

public class mytest1 {

	public static void main(String[] args) {
		String s1 = "def";
		String s2 = s1;
		s1+="g";
		System.out.println(s1+" "+ s2+ " "+ (s1==s2));
		StringBuilder a = new StringBuilder("def");
		StringBuilder b =a;
		a.append("g");
		System.out.println(a+" "+b+" "+(a==b));

	}

}
