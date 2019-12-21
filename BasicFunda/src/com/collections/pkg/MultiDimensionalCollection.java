package com.collections.pkg;
import java.util.*;
public class MultiDimensionalCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(3);
		a1.add(56);
		System.out.println(a1);
		
		ArrayList<ArrayList<Integer>> a2 = new ArrayList<ArrayList<Integer>>();
	    a2.add(new ArrayList<Integer>());
	    a2.get(0).add(0, 1);
	    a2.get(0).add(1, 2);
	    a2.get(0).add(2, 3);
	    a2.add(new ArrayList<Integer>());
	    a2.get(1).add(0, 4);
	    a2.get(1).add(1, 5);
	    a2.get(1).add(2, 6);
	    a2.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
	    a2.add(a1);
	    
	    System.out.println(a2.get(1));
	}

}
