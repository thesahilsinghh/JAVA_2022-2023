package com.HackerBlocks;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		compress(sc.next());

	}

	public static void compress(String s) {

		for (int i = 0; i < s.length(); i++) {
			int ans = 1;

			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {

				ans++;
				i++;

			}

			System.out.print(s.charAt(i));
			System.out.print(ans);
		}
	}

}
