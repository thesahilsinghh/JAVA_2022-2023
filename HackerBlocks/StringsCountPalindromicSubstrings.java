package com.HackerBlocks;

import java.util.Scanner;

import comString.Substrings;

public class StringsCountPalindromicSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		palindrom(sc.next());
	}

	public static void palindrom(String str) {

		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			String s;
			for (int j = i + 1; j <= str.length(); j++) {
				s = str.substring(i, j);
				if (pali(s) == true) {
					ans++;
				}

			}
		}

		System.out.println(ans);

	}

	public static boolean pali(String s) {

		int lo = 0;
		int hi = s.length() - 1;
		while (lo <= hi) {
			if (s.charAt(lo) != s.charAt(hi)) {
				return false;
			}
			
			lo++;
			hi--;
		}
		return true;
	}

}
