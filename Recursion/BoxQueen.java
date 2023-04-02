package com.Recursion;

public class BoxQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean[4];
		int q = 2;
		box(arr, q, 0, "");
	}

	public static void box(boolean[] arr, int q, int qp, String ans) {

		if (qp == q) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == false) {
				arr[i] = true;
				box(arr, q, qp + 1, ans + "b" + i + "q" + qp);

			}

			arr[i] = false;
		}

	}

}
