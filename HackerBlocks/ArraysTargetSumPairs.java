package com.HackerBlocks;

import java.util.Iterator;
import java.util.Scanner;

public class ArraysTargetSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sum(arr, sc.nextInt());
	}

	public static void sum(int[] arr, int t) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == t) {
					System.out.println(Math.max(arr[i], arr[j]) + " and " + Math.min(arr[i], arr[j]));
				}
			}
		}
	}

}
