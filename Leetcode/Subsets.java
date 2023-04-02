package com.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		print(arr, 0, ll, ans);
		System.out.println(ans);

	}

	public static void print(int[] arr, int idx, List<Integer> ll, List<List<Integer>> ans) {
		if (idx == arr.length) {
			ans.add(new ArrayList<>(ll));
			return;
		}

		print(arr, idx + 1, ll, ans);
		ll.add(arr[idx]);
		print(arr, idx + 1, ll, ans);
		ll.remove(ll.size() - 1);

	}
}
