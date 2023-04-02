package com.Leetcode;

import java.util.*;

public class PalindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		String str = "a";
		partition(str, list,ans);
		System.out.println(ans);

	}

	public static void partition(String ques, List<String> list,List<List<String>> ans ) {

		if (ques.length() == 0) {
			ans.add(new ArrayList<>(list));
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {

			String str = ques.substring(0, i);
			if (check(str) == true) {
				list.add(str);

				partition(ques.substring(i), list,ans );
				list.remove(list.size() - 1);
			}
		}
	}

	public static boolean check(String str) {

		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
