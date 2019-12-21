package com.programmingpractise.questions;
/*
 * Java Program to find Duplicate Words in a sentence
 */


import java.util.HashMap;
import java.util.Iterator;

public class DuplicateString {

	public static void main(String[] args) throws ClassNotFoundException {
		findDuplicateString("i am am a java java program");
	}

	private static void findDuplicateString(String string) {
		String[] tmpString = string.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		for (String str : tmpString) {
			if (hm.get(str) != null) {
				hm.put(str, hm.get(str) + 1);
			} else {
				hm.put(str, 1);
			}
		}
		Iterator<String> itr = hm.keySet().iterator();
		while (itr.hasNext()) {
			String temp = itr.next();
			if (hm.get(temp) > 1) {
				System.out.println(temp);
			}
		}
	}

}
