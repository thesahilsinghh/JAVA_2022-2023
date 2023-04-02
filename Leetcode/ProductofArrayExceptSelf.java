package com.Leetcode;

import java.util.Scanner;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		product(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void product(int[] nums) {

		int[] lft = new int[nums.length];
		int[] rgt = new int[nums.length];

		lft[0] = 1;
		rgt[nums.length - 1] = 1;

		for (int i = 1; i < nums.length; i++) {

			lft[i] = lft[i - 1] * nums[i - 1];
		}

		for (int i = nums.length - 2; i >= 0; i--) {

			rgt[i] = nums[i + 1] * rgt[i + 1];

		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = lft[i] * rgt[i];
		}

	}

}
