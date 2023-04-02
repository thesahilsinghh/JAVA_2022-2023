package com.Recursion;

public class Coinpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 6 };
		permute(arr, 10, "");

	}

	public static void permute(int[] arr, int tq, String ans) {

		if (tq == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < arr.length; i++) {

			if (tq >= arr[i]) {
				permute(arr, tq - arr[i], ans + arr[i]);
			}
		}
	}

}
