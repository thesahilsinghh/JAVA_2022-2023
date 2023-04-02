package com.HackerBlocks;

import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		for (int i = 0; i < k; i++) {

			int n = sc.nextInt();

			int[] arr = new int[n];

			for (int j = 0; j < args.length; j++) {
				arr[j] = sc.nextInt();
			}
			trap(arr);
		}
	}

	public static void trap(int[] height) {

		int[] lft = new int[height.length];
		int[] rgt = new int[height.length];

		lft[0] = height[0];

		for (int i = 1; i < height.length; i++) {

			lft[i] = Math.max(height[i], lft[i - 1]);
		}

		rgt[height.length - 1] = height[height.length - 1];

		for (int i = height.length - 2; i >= 0; i--) {

			rgt[i] = Math.max(height[i], rgt[i + 1]);
		}

		int add = 0;

		for (int i = 0; i < height.length; i++) {
			add += Math.min(lft[i], rgt[i]) - height[i];
		}

		System.out.println(add);
	}
}
