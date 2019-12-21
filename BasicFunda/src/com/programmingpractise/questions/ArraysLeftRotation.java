package com.programmingpractise.questions;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
		System.out.println(" ");
		int rotation = 4;
		int[] result = ArraysLeftRotation.rotleft(array, rotation);
		for (int k = 0; k < result.length; k++) {
			System.out.print(result[k] + " ");
		}
	}

	static int[] rotleft(int[] array, int rotation) {
		int size = array.length;
		int noOfRotation = rotation;
		int index = 0;
		int[] temp = new int[size];
		for (int i = 0; i < size; i++) {
			if (noOfRotation <= (size - 1)) {
				temp[i] = array[noOfRotation];
			}
			noOfRotation++;
		}
		for (int j = (size - rotation); j < size; j++) {
			temp[j] = array[index];
			index++;
		}

		return temp;

	}
}
