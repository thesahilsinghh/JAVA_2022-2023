package com.HackerBlocks;

import java.util.Scanner;

public class ArraysWavePrintRowWise {

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
		print(arr);

	}

	public static void print(int[][] arr) {
		int row = 0;

		while (row <= arr.length - 1) {

			if (row % 2 == 0) {

				for (int j = 0; j < arr[0].length; j++) {

					System.out.print(arr[row][j] + "," );

				}
				row++;
			}

			else {
				for (int i = arr[0].length - 1; i >= 0; i--) {
					System.out.print(arr[row][i] + "," + " ");
				}
				row++;
			}
		}

		System.out.println("END");
	}
}