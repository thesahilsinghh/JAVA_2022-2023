package com.Recursion;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toss(2, "");

	}

	public static void toss(int n, String ans) {

		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (ans.length() >= 1 && ans.charAt(ans.length() - 1) != 'H') {
			toss(n - 1, ans + "H");
		}
		toss(n - 1, ans + "T");

	}

}
