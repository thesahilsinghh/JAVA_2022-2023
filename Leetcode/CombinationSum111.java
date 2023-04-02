package com.Leetcode;

import java.util.*;

public class CombinationSum111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean[9];
		int n = k;
		int t = n;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		dice(arr, n, t, 0, ll, 0,ans);
		return ans;
		

	}

	public static void dice(boolean[] arr, int n, int t, int p, List<Integer> ll, int idx,List<List<Integer>> ans ) {
		if (p == n && t == 0) {
			ans.add(new ArrayList<>(ll));
			return;
		}

		for (int j = idx; j < 9; j++) {

			if (arr[j] == false && (j + 1) <= t) {
				arr[j] = true;
				ll.add(j + 1);
				dice(arr, n, t - (j + 1), p + 1, ll, j + 1,ans);
				ll.remove(ll.size() - 1);
				arr[j] = false;
			}
		}
	}

}
