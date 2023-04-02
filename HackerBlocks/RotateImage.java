package com.HackerBlocks;

import java.util.Scanner;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		transpose(arr);

		System.out.println();
		print(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void transpose(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int t = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = t;
			}

		}
	}

	public static void print(int[][] arr) {
		int n = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {

			for (int j = 0; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[n][j];
				arr[n][j] = temp;
			}
			n--;
		}

	}

}
