package com.HackerBlocks;

import java.util.Scanner;

public class NQueenHard {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] arr = new boolean[n][n];

		queenplacement(arr, 0, n);
		System.out.println(count);

	}

	private static void queenplacement(boolean[][] arr, int row, int qp) {
		if (qp == 0) {
			count++;
			return;
		}

		for (int i = row; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				if (check(arr, i, j) == true) {

					arr[i][j] = true;
					queenplacement(arr, i + 1, qp - 1);
					arr[i][j] = false;

				}
			}
		}

	}

	private static boolean check(boolean[][] arr, int i, int j) {

		for (int row = i; row >= 0; row--) {
			if (arr[row][j] == true) {
				return false;
			}

		}

		int ro = i;
		int co = j;
		while (ro >= 0 && co >= 0) {
			if (arr[ro][co] == true) {
				return false;
			}
			ro--;
			co--;
		}
		int row = i;
		int col = j;
		while (row >= 0 && col < arr.length) {
			if (arr[row][col] == true) {
				return false;
			}
			row--;
			col++;
		}
		return true;
	}

}
