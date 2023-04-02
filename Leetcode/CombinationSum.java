package com.Leetcode;

import java.util.*;

public class CombinationSum {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();

		int[] arr = { 2, 3, 5, 6 };
		combinantion(arr, 7, 0, list, ans);
		System.out.println(ans);
	}

	public static void combinantion(int[] arr, int tq, int indx, List<Integer> list, List<List<Integer>> ans) {

		if (tq == 0) {
			ans.add(new ArrayList<>(list));
			return;
		}
		for (int i = indx; i < arr.length; i++) {

			if (arr[i] <= tq) {

				list.add(arr[i]);
				combinantion(arr, tq - arr[i], i, list, ans);
				list.remove(list.size() - 1);
			}
		}
	}

}
