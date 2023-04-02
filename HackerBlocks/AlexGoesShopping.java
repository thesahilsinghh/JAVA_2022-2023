package com.HackerBlocks;

public class AlexGoesShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = { 100, 200, 400, 100 };
		int m = 200;
		int t = 3;
		check(arr, m, t);
	}

	public static void check(int[] arr, int m, int t) {

		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == m) {
				ans++;
			}
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == m) {

					m = m - arr[j] + arr[i];
					ans++;
				}
			}

		}
		if (ans == t) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
