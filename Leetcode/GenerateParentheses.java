package com.Leetcode;

import java.util.*;

public class GenerateParentheses {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		generate(3, 0, 0, "", list);
		System.out.println(list);
		return list;

	}

	public static void generate(int n, int open, int close, String ans, List<String> list) {

		if (open == n && close == n) {
			list.add(ans);
			return;
		}

		if (open < n) {
			generate(n, open + 1, close, ans + "(", list);
		}
		if (close < open) {

			generate(n, open, close + 1, ans + ")", list);
		}
	}

}
