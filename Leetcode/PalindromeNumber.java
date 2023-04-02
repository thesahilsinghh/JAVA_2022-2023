package com.Leetcode;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 123;
		int x = 0;
		while (k > 0) {

			int a = k % 10;
			k /= 10;
			x = (x * 10) + a;
			isPalindrome(x);
		}

	}

	public static boolean isPalindrome(int x) {

		
		if (x == 0) {
			return true;
		}

		if (x < 0 || x % 10 == 0) {
			return false;
		}
		int n=x;
		int k = 0;
		while (n > 0) {
			int p = n % 10;
			n /= 10;
			k = (k * 10) + p;
		}
		if (k == x || x == k % 10) {
			return true;
		} else {
			return false;
		}

	}

}
