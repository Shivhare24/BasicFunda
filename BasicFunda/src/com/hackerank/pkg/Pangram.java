package com.hackerank.pkg;

import java.util.ArrayList;
import java.util.List;

public class Pangram {

	public static void main(String[] args) {
		List<String> string = new ArrayList<String>();
		string.add("pack my box with five dozen liquor jugs contains");
		string.add("this is not a Pangram");
		String output = checkPangram(string);
		System.out.println(output);

	}

	public static String checkPangram(List<String> string) {
		int count = 0;
		String result="";
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < string.size(); i++) {
			String str = string.get(i).replace(" ", "");
			for (int j =0; j < alphabets.length(); j++) {
				if (!str.contains(Character.toString(alphabets.charAt(j)))) {
					count++;
					break;
				}
			}
				if (count == 0) {
					result += "1";
				} else {
					result += "0";
				}
				count = 0;
		}

		return result;
	}

}
