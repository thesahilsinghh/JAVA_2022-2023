package com.Leetcode;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		print(s);

	}

	public static void print(char[] s) {

		int a = 0;
		int b = s.length - 1;
		while (a < b) {
			char t = s[a];
			s[a] = s[b];
			s[b] = t;

			a++;
			b--;
		}
	}

}
