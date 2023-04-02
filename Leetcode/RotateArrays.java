package com.Leetcode;

public class RotateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(arr, 0, arr.length - 1);
		int k = 3;
		k = k % arr.length;
		rotate(arr, 0, k-1);
		rotate(arr, k, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void rotate(int[] nums, int start, int end) {

		while (start < end) {

			int t = nums[start];
			nums[start] = nums[end];
			nums[end] = t;
			start++;
			end--;
		}

	}
}
