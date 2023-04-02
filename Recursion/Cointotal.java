package com.Recursion;

public class Cointotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5 };
		print(arr, 10, 0, "");

	}

	public static void print(int[] arr, int x, int t, String ans) {

		if (t == x) {
			System.out.println(ans);
			return;
		}
		if (t > x) {
			return;
		}

		for (int i = 0; i < arr.length; i++) {

			int n = arr[i];
			print(arr, x, t + n, ans + n);

		}

	}
}
