package com.HackerBlocks;

import java.util.Scanner;

public class SortjustZeroesandOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr= new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void sort(int[] nums) {
		int lo = 0;
		int mi = 0;
		int hi = nums.length - 1;

		while (mi <= hi) {

			if (nums[mi] == 1) {

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



		}

	}

}
