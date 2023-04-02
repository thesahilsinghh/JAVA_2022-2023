package com.Recursion;

public class SudokuSolver {

	public static void main(String[] args) {
			int[][] arr = { { 3, 1, 6, 5, 7, 8, 4, 9, 2 },
					         { 5, 2, 9, 1, 3, 4, 7, 6, 8 },
					         { 4, 8, 7, 6, 2, 9, 5, 3, 1 },
					         { 2, 6, 3, 0, 1, 5, 9, 8, 7 },
					         { 9, 7, 4, 8, 6, 0, 1, 2, 5 },
					         { 8, 5, 1, 7, 9, 2, 6, 4, 3 },
					         { 1, 3, 8, 0, 4, 7, 2, 0, 6 },
					         { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
					         { 7, 4, 5, 0, 8, 6, 3, 1, 0 } };
		print(arr, 0, 0);
	}

	public static void print(int[][] arr, int c, int r) {

		if (c == 9) {
			r++;
			c = 0;

		}

		if (r == 9) {
			display(arr);
			return;
		}

		if (arr[r][c] != 0) {
			print(arr, c + 1, r);
		}

		else {
			for (int val = 1; val <= 9; val++) {
				if (check(arr, r, c, val) == true) {
					arr[r][c] = val;
					print(arr, c + 1, r);
					arr[r][c] = 0;
				}
			}
		}

	}

	private static void display(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

	}

	private static boolean check(int[][] arr, int r, int c, int val) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[r][i] == val) {
				return false;
			}
		}
		for (int i = 0; i < arr[0].length; i++) {
			if (arr[i][c] == val) {
				return false;
			}
		}

		int rr = r - r % 3;
		int cc = c - c % 3;
		for (int i = rr; i < rr + 3; i++) {
			for (int j = cc; j < cc; j++) {
				if (arr[i][j] == val) {
					return false;
				}
			}
		}
		return true;

	}

}
