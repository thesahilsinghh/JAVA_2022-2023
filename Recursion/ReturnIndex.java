package com.Recursion;

public class ReturnIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 1, 3, 4, 3, 4, 3 };
		System.out.println(search(arr, 0, 5));
	}

	public static int search(int[] arr, int n, int x) {
		if (n == arr.length) {
			return -1;
		}
		if (arr[n] == x) {
			return n;
		}

		return search(arr, n + 1, x);

	}

}
