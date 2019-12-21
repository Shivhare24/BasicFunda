package com.sortingAlgo.org;

public class BubbleSort {
	

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		bs.bubble();
	}
	
	public void bubble() {
		int[] i = {1,4,7,3,1,5,3,9,8,4};
		for(int c=0; c<i.length; c++) {
			System.out.print(i[c]);
			}
		System.out.println();
		for (int a=0; a<i.length-1; a++) {
			for(int b=0; b<i.length-a-1; b++) {
				if (i[b]>i[b+1]) {
					int temp = i[b];
					i[b] = i[b+1];
					i[b+1] =temp;
				}
			}
		}
		for(int c=0; c<i.length; c++) {
		System.out.print(i[c]);
		}
	}
}
