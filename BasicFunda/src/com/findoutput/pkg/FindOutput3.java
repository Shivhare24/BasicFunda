package com.findoutput.pkg;

import java.util.Arrays;
import java.util.List;

public class FindOutput3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
		}
		System.out.println(list);
	}

}
