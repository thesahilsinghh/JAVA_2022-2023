package com.Leetcode;

import java.util.Iterator;
import java.util.Scanner;

public class RainWater_Trapping {
	public static void main(String[] args) {

		
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		Trap(arr);
	}

	public static void Trap(int[] height) {

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
