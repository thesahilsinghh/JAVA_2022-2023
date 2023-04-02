package com.Recursion;

public class NthQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[][] arr = new boolean[4][4];

		int n = 4;
		queen(arr, n, 0);

	}

	public static void queen(boolean[][] arr, int n, int row) {
		if (n == 0) {
			display(arr);
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (issafe(arr, row, i) == true) {
				arr[row][i] = true;

				queen(arr, n - 1, row + 1);

				arr[row][i] = false;

			}
		}
	}

	public static void display(boolean[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static boolean issafe(boolean[][] arr, int row, int i) {
		int rr = row;
		int cc = i;

		while (rr >= 0) {
			if (arr[rr][cc] == true) {
				return false;
			}

			rr--;
		}
		rr = row;
		cc = i;

		while (rr >= 0 && cc >= 0) {
			if (arr[rr][cc] == true) {
				return false;
			}
			rr--;
			cc--;
		}
		rr = row;
		cc = i;

		while (rr >= 0 && cc < arr.length) {
			if (arr[rr][cc] == true) {
				return false;
			}
			rr--;
			cc++;
		}
		return true;

	}

}
