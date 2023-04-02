package com.Recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		// head recursion
		System.out.println(factorial(n));

		// tail recursion
		System.out.println(fact(n, 1));
	}

	public static int fact(int n, int ans) {

		if (n == 1) {
			return ans;
		}

		return fact(n - 1, n * ans);
	}

	public static int factorial(int n) {

		if (n == 1) {
			return 1;
		}

		return n * factorial(n - 1);

	}

}
