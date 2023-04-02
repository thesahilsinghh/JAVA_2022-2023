package com.HackerBlocks;

import java.util.Scanner;

public class NthTriangleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(triangle(n));

	}

	public static int triangle(int n) {

		if (n == 1) {
			return 1;
		}

		int f = triangle(n - 1);
		return f + n;
	}

}
