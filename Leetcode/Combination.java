package com.Leetcode;

import java.util.*;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean[4];
		int q = 2;
		ArrayList<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		box(arr, q, 0, 0, list, ans);
		System.out.println(ans);
	}

	public static void box(boolean[] arr, int q, int qp, int idx, ArrayList<Integer> list, List<List<Integer>> ans) {

		if (qp == q) {
			ans.add(new ArrayList<Integer>(list));
			return;
		}

		for (int i = idx; i < arr.length; i++) {
			if (arr[i] == false) {
				arr[i] = true;
				list.add(i + 1);
				box(arr, q, qp + 1, i + 1, list, ans);
				list.remove(list.size()-1);
				arr[i] = false;
			}

		}

	}

}
