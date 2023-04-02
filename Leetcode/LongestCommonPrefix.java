package com.Leetcode;

import java.util.*;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "car", "cars","carevan" };
		System.out.println(prefix(strs));
		System.out.println(Efficient(strs));
	}

	public static String prefix(String[] strs) {

		String ans = "";
		int y = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			min = Math.min(min, strs[i].length());
		}

		for (int i = 0; i < min; i++) {

			for (int j = 0; j < strs.length - 1; j++) {
				if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
					return ans;
				} else {
					y++;
				}

			}
			if (y == strs.length - 1) {
				ans += strs[0].charAt(i);
			}

			y = 0;
		}
		return ans;

	}

	public static String Efficient(String[] strs) {

		String ans = "";
		int y = 0;
		Arrays.sort(strs);

		for (int i = 0; i < strs[0].length(); i++) {
			if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
				return ans;
			} else {
				ans += strs[0].charAt(i);
			}
		}

		return ans;
	}

}
