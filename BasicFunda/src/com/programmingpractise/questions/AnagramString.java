package com.programmingpractise.questions;

/*
 * Java Program to Find if two strings are Anagram or not
 */
import java.util.HashMap;

public class AnagramString {

	public static void main(String[] args) {
		findAnagram("peek", "keep");

	}

	private static void findAnagram(String string1, String string2) {
		HashMap<Character, Integer> hm1 = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();
		for (int i = 0; i < string1.length(); i++) {
			if (hm1.get(string1.charAt(i)) != null) {
				hm1.put(string1.charAt(i), hm1.get(string1.charAt(i)) + 1);
			} else {
				hm1.put(string1.charAt(i), 1);
			}
		}

		for (int j = 0; j < string2.length(); j++) {
			if (hm2.get(string2.charAt(j)) != null) {
				hm2.put(string2.charAt(j), hm2.get(string2.charAt(j)) + 1);
			} else {
				hm2.put(string2.charAt(j), 1);
			}
		}

		for (int k = 0; k < string1.length(); k++) {
			if ((hm1.get(string1.charAt(k))) == (hm2.get(string2.charAt(k)))) {
				System.out.println("Anagram");
			}

		}
	}

}
