package com.mathematical_topics.pkg;

import java.util.ArrayList;

public class StringPermutation {

	private static ArrayList<String> findStringPermutation(String str) {
		ArrayList<String> resultList = new ArrayList<String>();
		getPermutations("", str, resultList);
		System.out.println(resultList.size());
		return resultList;
	}
	private static void getPermutations(String prefix, String suffix,
			ArrayList<String> resultList) {
		if (suffix.length() == 0)
			resultList.add(prefix);
		else {
			for (int i = 0; i < suffix.length(); i++) {
				getPermutations(prefix + suffix.charAt(i),
						suffix.substring(0, i)
								+ suffix.substring(i + 1, suffix.length()),
						resultList);
			}
		}

	}

	public static void main(String[] args) {
		System.out.println(findStringPermutation("aabc"));

	}

}
