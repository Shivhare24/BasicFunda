package com.programmingpractise.questions;
/*
 * Java Program to find Duplicate Characters in a String
 */


import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCharacter {

	public static void main(String[] args) {
		findDuplicateCharacter("abacdd");

	}

	private static void findDuplicateCharacter(String string) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			if (hm.get(string.charAt(i)) != null) {
				hm.put(string.charAt(i), hm.get(string.charAt(i)) + 1);
			} else {
				hm.put(string.charAt(i), 1);
			}
		}

		Iterator<Character> itr = hm.keySet().iterator();
		while (itr.hasNext()) {
			Character c = itr.next();
			if (hm.get(c) > 1) {
				System.out.println(c);
			}
		}
	}

}
