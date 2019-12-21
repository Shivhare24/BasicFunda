package com.programmingpractise.questions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayIntersectionPoint {
	static int count = 0;
	static int[] arr = new int[5];

	public static void main(String[] args) {
		int[] arr1 = {2, 6, 9, 11, 13, 17};
		int[] arr2 = {3, 6, 7, 11, 13, 18};
		int[] arr3 = {4, 5, 6, 9, 11, 13};
		intersectionPointUsingCollection(arr1, arr2, arr3);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void intersectionPointUsingCollection(int[] arr1, int[] arr2,
			int[] arr3) {
		List<Integer> list1 = Arrays.stream(arr1).boxed()
				.collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(arr2).boxed()
				.collect(Collectors.toList());

		for (int i = 0; i < arr3.length; i++) {
			if ((list1.contains(arr3[i])) && (list2.contains(arr3[i]))) {
				arr[count] = arr3[i];
				count++;
				continue;
			}
		}
	}

}
