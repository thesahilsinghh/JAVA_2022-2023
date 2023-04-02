package com.HackerBlocks;

import java.util.Scanner;

public class StringsStringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		ss(a);
	}

	public static void ss(String s) {
		for (int i = 0; i < s.length(); i++) {
			int ans = 1;

			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {

				ans++;
				i++;

			}

			if (ans > 1) {
				System.out.print(s.charAt(i));
				System.out.print(ans);
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
