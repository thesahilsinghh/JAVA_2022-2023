package com.HackerBlocks;

import java.util.Scanner;

public class StringsOddEvenCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		change(sc.next());
		
		

	}

	public static void change(String str) {

		String s = "";
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) % 2 != 0) {
				int n = str.charAt(i) + 1;

				s += (char) n;
			}

			else {
				int n = str.charAt(i) - 1;

				s += (char) n;
			}
		}

		System.out.println(s);

	}
}
