package com.HackerBlocks;

import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			winn(a, b);	
		}
		

	}

	public static void winn(int a, int b) {
		int q = 1;
		while (a > 0 && b > 0) {

			a -= q;
			q++;
			b -= q;
			q++;

		}

		if (a > b) {
			System.out.println("Ayush");
		}

		else {
			System.out.println("Harshit");
		}

	}

}
