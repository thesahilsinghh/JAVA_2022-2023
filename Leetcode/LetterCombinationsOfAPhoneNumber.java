package com.Leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

	static String[] arr = { "","","abc", "def", "ghi", "jkl", "mno", "pqrs","tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		print(digits, "", list);
		System.out.println(list);
	}

	public static void print(String ques, String ans, List<String> list) {

		if (ques.length() == 0) {
			list.add(ans);
			return;
		}

		char ch = ques.charAt(0);
		String press = arr[ch - 48];

		for (int i = 0; i < press.length(); i++) {
			print(ques.substring(1), ans + press.charAt(i), list);

		}
	}

}
