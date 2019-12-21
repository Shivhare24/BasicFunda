package com.programmingpractise.questions;

/*
 * Java program to check if a given number is prime or not
 */

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		isPrime(n);
		listPrime(n);

	}

	private static void listPrime(int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			if (i > 1) {
				if (i == 2 || i == 3 || i == 5 || i == 7) {
					System.out.println(i);
				} else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0
						&& i % 7 != 0) {
					System.out.println(i);
				}
			}
		}
	}

	private static void isPrime(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			System.out.println("not valid");
		} else if (n == 2 || n == 3 || n == 5 || n == 7) {
			System.out.println("its a prime");
		} else if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
			System.out.println("not a prime");
		} else
			System.out.println("its a prime");

	}
}
