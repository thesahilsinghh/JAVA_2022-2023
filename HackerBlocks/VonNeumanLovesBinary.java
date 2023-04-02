package com.HackerBlocks;

import java.util.Scanner;

public class VonNeumanLovesBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for (int i = 0; i < n; i++) {
		
			int l=sc.nextInt();
			
			decimal(l);
		}
		
		
	}

	public static void decimal(int n) {

		int x = 0;
		int h = 0;
		while (n > 0) {

			int rem = n % 10;
			x += rem * Math.pow(2, h);

			n = n / 10;
			h++;

		}
		System.out.println(x);
	}

}
