package com.Recursion;

public class JumpingCount {

	static int anss = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jump(0, 4, "");
		System.out.println(anss);

	}

	public static void jump(int n, int t, String ans) {

		if (n == t) {
			anss += 1;
			System.out.println(ans + " ");
			return;
		}
		if (n >= t) {

			return;
		}

		jump(n + 1, t, ans + '1');
		jump(n + 2, t, ans + '2');
		jump(n + 3, t, ans + '3');

	}
}
