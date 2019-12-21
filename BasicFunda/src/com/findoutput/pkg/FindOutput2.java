package com.findoutput.pkg;

import java.util.ArrayList;
import java.util.List;

public class FindOutput2 {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
		}
		System.out.println(list);
		
		for (Integer integer : list) {
			list.remove(integer);
		}
		System.out.println(list);
	}

}
