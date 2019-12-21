package com.programmingpractise.questions;

/*
 * Java program which will print Fibonacci series e.g. 1 1 2 3 5 8 13 ... upto a given number.
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 10;
			for (int n = 1; n <= value; n++) {
				System.out.println(fibonacci1(n));
				System.out.println(fibonacci2(n));
			}
		}
	
	/*
	 * using Recursion
	 */
	private static int fibonacci1(int n) {
		// TODO Auto-generated method stub
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci1(n - 1) + fibonacci1(n - 2);
	}
	
	private static int fibonacci2(int n) {
		if(n ==1 || n==2) {
			return 1;
		}
		int fibo1 =1, fibo2 =1, fibonacci =1;
		for(int i =3; i<=n; i++) {
			fibonacci = fibo1 + fibo2;             
            fibo1 = fibo2;
            fibo2 = fibonacci;
		}
		return fibonacci;
	}
}
