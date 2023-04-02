package com.HackerBlocks;

import java.util.Scanner;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int t = sc.nextInt();
		System.out.println(search(arr, t));

	}

	public static int search(int[][] matrix, int target) {

		int ro = 0;
		int co = matrix[0].length - 1;
		
		int n = matrix.length - 1;
		

		while (ro <= n && co >= 0) {

			if (matrix[ro][co] == target) {
				return 1;
			}

			else if (matrix[ro][co] > target) {
				co--;
			}

			else {
				ro++;
			}
		}

		return 0;
	}

}
