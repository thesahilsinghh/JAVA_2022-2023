package com.Leetcode;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 3 };
		int t = 6;
		sum(nums, t);

	}

	public static void sum(int[] nums, int target) {

		int[] q = new int[2];

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {

					q[0] = i;
					q[1] = j;
					break;
				}
			}

		}

//		return q;

	}

}
