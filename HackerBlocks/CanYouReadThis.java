package com.HackerBlocks;

import java.util.Scanner;

public class CanYouReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		read(s);

	}

	public static void read(String s) {

		for (int i = 0; i < s.length() - 1; i++) {

			System.out.print(s.charAt(i));
			if (s.charAt(i + 1) < 91) {
				System.out.println();
			}

		}
		System.out.println(s.charAt(s.length() - 1));
	}

}
