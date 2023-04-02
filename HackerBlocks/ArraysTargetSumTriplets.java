package com.HackerBlocks;

import java.util.Scanner;

public class ArraysTargetSumTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		triplet(arr, sc.nextInt());
	}

	public static void triplet(int[] arr, int t) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				for (int j2 = i + 1; j2 < j; j2++) {
					if (arr[i] + arr[j2] + arr[j] == t) {
						System.out.print(arr[i] + "," + " ");
						System.out.print(arr[j2] + " and ");
						System.out.print(arr[j]);
						System.out.println();
					}

				}
			}
		}
	}

}
