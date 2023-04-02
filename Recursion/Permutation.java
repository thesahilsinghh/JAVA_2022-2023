package com.Recursion;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permute("abcd", "");

	}

	public static void permute(String s, String ans) {

		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			permute(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
		}
	}

}
