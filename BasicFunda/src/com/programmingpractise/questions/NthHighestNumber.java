package com.programmingpractise.questions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NthHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int arr[] = {2, 6, 3, 8, 5, 1, 99, 4};
		nthHighestNumber(arr, n);
	}

	private static void nthHighestNumber(int[] arr, int n) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.stream(arr).boxed().sorted()
				.collect(Collectors.toList());
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println();
		int nth = list.size() - n;
		System.out.println(list.get(nth));

	}

}
