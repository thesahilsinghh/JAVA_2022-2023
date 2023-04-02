package com.HackerBlocks;

import java.util.Scanner;

public class FibonacciPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int x = 1;
		int ro = sc.nextInt();
		int line = 2;

		System.out.println(n);

		while (line <= ro) {
			int star = 1;
			while (star <= line) {
				System.out.print(x + "\t");
				star++;
				int t = x;
				x = n + x;
				n = t;

			}

			System.out.println();

			line++;

		}
	}

}
