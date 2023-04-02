package com.HackerBlocks;

import java.util.Scanner;

public class OddandEvenbackinDelhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int k=sc.nextInt();
			car(k);
		}

	}

	public static void car(int n) {

		int add = 0;
		int even = 0;

		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				even += rem;
			} else {
				add += rem;
			}

			n = n / 10;
		}

		if (even % 4 == 0) {
			System.out.println("Yes");
		}

		else if (add % 3 == 0) {
			System.out.println("Yes");
		}

		else {
			System.out.println("No");
		}
	}

}
