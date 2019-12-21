package com.programmingpractise.questions;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Sum_of_Two_in_Array {

	static int count = 0;

	public static void main(String[] args) {
		int arr[] = {8, 3, 4, 7, 12, 15, 1, 4};
		int sum = 16;
		int value = noOfSubset(arr, sum);
		System.out.println(value);
		LinkedList<Integer> l = new LinkedList<>();
		l.add(3);
		l.add(6);
		l.add(9);
		l.add(12);

		System.out.println(l);

	}
	private static int noOfSubset(int[] arr, int sum) {
		int diff = 0;
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			diff = sum - arr[i];
			if (s.contains(diff)) {
				System.out.println("subset is " + diff + ", " + arr[i]);
				count++;
			}
			s.add(arr[i]);
		}

		return count;

	}

}
