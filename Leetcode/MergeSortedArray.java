package com.Leetcode;

import java.util.Scanner;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] nums1 = new int[6];
		int m = 3;

		for (int i = 0; i < m; i++) {
			nums1[i] = sc.nextInt();
		}
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		sort(nums1, m, nums2, n);

		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i]+" ");
		}

	}

	public static void sort(int[] nums1, int m, int[] nums2, int n) {

		int i = nums1.length - 1;
		int p1 = m - 1;
		int p2 = n - 1;

		while (p1 >= 0 && p2 >= 0) {

			if (nums1[p1] > nums2[p2]) {
				nums1[i] = nums1[p1];
				i--;
				p1--;
			}

			else {
				nums1[i] = nums2[p2];
				i--;
				p2--;
			}
		}

	}

}
