package com.HackerBlocks;

import java.util.Scanner;

public class StringsisPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println(palindrom(sc.next()));
	}

	public static boolean palindrom(String str) {

		int lo = 0;
		int hi = str.length() - 1;

		while (lo < hi) {

			if (str.charAt(lo) != str.charAt(hi)) {

				return false;
			}

			lo++;
			hi--;

		}

		return true;

	}

}
