package com.programmingpractise.questions;
import java.util.Arrays;

/*
 * Program to find the largest subset of array which contains sum of n
 */
public class ArraySubset {

	public static void main(String[] args) {
		int arr[] = {2,3,6,9,16,7};
		int sum =4;
		largestSubset(arr, sum);
	}

	private static void largestSubset(int [] arr, int value) {
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
		
	}

}
