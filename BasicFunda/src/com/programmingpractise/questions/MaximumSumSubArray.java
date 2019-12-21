package com.programmingpractise.questions;
/*
 * to find the subarray with maximum sum using Kadane Algorithm
 */

public class MaximumSumSubArray {

	public static void subArray(int [] arr) {
		int sum = arr[0];
		int max =arr[0];
		
		for(int i =1; i< arr.length; i++) {
		
			if(sum <0) {
				sum = arr[i];
			}
			else {
				sum +=arr[i];
			}
		max = Math.max(sum, max);
	}
		System.out.println(max);
}
	
	public static void main(String[] args) {
	int[] arr = {2,-8,5,0,-2,1,7};
	subArray(arr);
	}
}
