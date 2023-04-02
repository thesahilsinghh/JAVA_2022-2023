package com.HackerBlocks;

import java.util.Iterator;

public class ArraysSumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 0, 2, 9, 8 };
		int[] brr = { 4, 5, 6, 7 };
		add(arr, brr);sx

	}

	public static void add(int[] arr, int[] brr) {
		int a = arr.length - 1;
		int b = brr.length - 1;

		int[] ne = new int[Math.max(arr.length, brr.length)];

		int carr = 0;

		for (int i = ne.length - 1; i >= 0; i--) {

			int ans = arr[a] + brr[b];
			ne[i] = ans % 10 + carr;
			ans /= 10;

			if (ans > 0) {
				carr++;
			} else {
				carr = 0;
			}
			a--;
			b--;
		}

		for (int i = 0; i < ne.length; i++) {
			System.out.println(ne[i]);
		}

	}

}
