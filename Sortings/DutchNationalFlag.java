package com.Sortings;

public class DutchNationalFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 2, 1, 1, 2, 2, 0, 1 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] nums) {

		int lo = 0;
		int mi = 0;
		int hi = nums.length - 1;

		while (mi <= hi) {

			if (nums[mi] == 2) {

				int t = nums[mi];
				nums[mi] = nums[hi];
				nums[hi] = t;

				hi--;

			}

			else if (nums[mi] == 0) {
				int t = nums[lo];
				nums[lo] = nums[mi];
				nums[mi] = t;

				lo++;
				mi++;
			}

			else {
				mi++;
			}

		}
		
		
	}

}
