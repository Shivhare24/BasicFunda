package com.tree.org;

public class BInary {

	public static void main(String[] args) {
		int[] Array = { 1, 3, 5, 6, 7, 8, 9 };
		new binarySearch().binaryMethod(Array);
	}
}

class binarySearch {
	void binaryMethod(int Array[]) {
		

	}

	int middleNumber(int ArrayLength) {
		if (ArrayLength > 1 && ArrayLength % 2 == 0) {
			return ArrayLength / 2;
		} else if (ArrayLength > 1 && ArrayLength % 2 != 0) {
			return (ArrayLength / 2) + 1;
		}
		return 0;
	}

	int ArrayLength(int Array[]) {
		return Array.length;
	}

}
