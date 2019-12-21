package com.DynamicProgramming.org;


/*
 *  Overlapping Sub-Problem Property
 */
public class Fibonacci {

	final static int NIL = -1;
	final static int MAX =100;
	static int lookup[] =new int [MAX];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_initialize();
		System.out.println(memorization(6));
	}

	private static int memorization(int i) {
		if(lookup[i] == NIL) {
			if(i <=1) {
				lookup[i] = i;
			}
			else {
				lookup[i] = memorization(i-1) + memorization(i-2);
			}
			
		}
		return lookup[i];
		
	}
	
	private static void _initialize() {
		for(int i=0; i<MAX; i++) {
			lookup[i] = NIL;
		}
	}
	
	// 0 1 1 2 3 5 8 13 21 34
	

}
