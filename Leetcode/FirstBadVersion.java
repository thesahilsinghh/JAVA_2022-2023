package com.Leetcode;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int fst(int n) {

		int lo = 1;
		int hi = n;
		int ans = 0;

		while (lo <= hi) {

			int mi = (lo + hi) / 2;
			if (isBadVersion(mi)==true) {

				ans = mi;
				hi = mi - 1;

			}

			else {
				lo = mi + 1;	
			}

		}
		return ans;
	}

	public static boolean isBadVersion(int mi) {
		// TODO Auto-generated method stub
		return false;
	}

}
