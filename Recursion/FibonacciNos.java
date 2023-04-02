package com.Recursion;

public class FibonacciNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int fib(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int a = fib(n - 1);
		int b = fib(n - 2);
		return a + b;

	}

}
