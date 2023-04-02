package com.Leetcode;

import java.util.*;
import java.util.List;

public class CombinationSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };

		Arrays.sort(candidates);
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		dice(candidates, target, ll, 0, ans);
		System.out.println(ans);

	}

	public static void dice(int[] candidates, int t, List<Integer> ll, int idx, List<List<Integer>> ans) {
		if (t == 0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = idx; i < candidates.length; i++) {
			if(i!=idx && candidates[i]==candidates[i-1]) {
				continue;
			}
		}

		for (int i = idx; i < candidates.length; i++) {

			if (candidates[i] <= t) {

				ll.add(candidates[i]);
				dice(candidates, t - candidates[i], ll, i + 1, ans);
				ll.remove(ll.size() - 1);

			}

		}
	}
}
