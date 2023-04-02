package com.Recursion;

import java.util.Scanner;

public class Subsequeance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[1];
		seq(sc.next(), "", ar);
		System.out.println();
		System.out.println(ar[0]);

	}

	public static void seq(String str, String ans, int[] ar) {
		if (str.length() == 0) {
			System.out.print(ans+" ");
			ar[0]++;
			return;
		}

		char c = str.charAt(0);
		seq(str.substring(1), ans, ar);
		seq(str.substring(1), ans + c, ar);

	}

}
