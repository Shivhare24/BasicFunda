package com.programmingpractise.questions;
/*
 * Java Program to find count of Words in a Sentence
 */



public class WordsInaString {

	public static void main(String[] args) {
		String string = "i am a String class Oject";
		int length = findWordsInaString(string);
		System.out.println(length);
	}

	private static int findWordsInaString(String string) {
		String[] str = string.split(" ");
		for (String string2 : str) {
			System.out.println(string2);
		}
		return str.length;

	}

}
