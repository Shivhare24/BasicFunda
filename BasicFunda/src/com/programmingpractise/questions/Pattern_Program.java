package com.programmingpractise.questions;

public class Pattern_Program {

	public static void main(String[] args) {
		FloydTriangle();
		System.out.println("----------------------------------------------------------------");
		PascalsTriangle();
	}

	public static void FloydTriangle() {
		int k = 1;
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println("");
		}
	}

	
	public static void PascalsTriangle() {
		int n = 5;

		for (int i = 0; i < n; i++) {
			int number = 1;
			System.out.printf("%" + (n - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}

	}

}
