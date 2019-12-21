package com.programmingpractise.questions;

public class SumTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 2,7,11,15 };
		int result = 9;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - 1; j++) {
				if (arr[i] + arr[j ] == result) {
					System.out.println("arr " + i + " ," + "arr " + j);
				}
			}
		}
	}

}
