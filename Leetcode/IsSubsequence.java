package com.Leetcode;

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSubsequence(String s, String t) {

		if (s.length() == 0) {
			return true;
		}

		int si = 0;
		int ti = 0;
		while (ti < t.length()) {
			if (t.charAt(ti) == s.charAt(si)) {
				si++;
				if (si == s.length()) {
					return true;
				}

			}
			ti++;

		}
		return false;
	}

}
