package com.findoutput.pkg;

public class FindOutput1 {

	public static void main(String[] args) {
		System.out.println(exceptionString());
	}

	public static String exceptionString() {
		try {
			throw new NullPointerException();
		} finally {
		System.out.println("rishi");
		}
	}
}
