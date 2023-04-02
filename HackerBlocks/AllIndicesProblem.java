package com.HackerBlocks;

import java.util.*;

public class AllIndicesProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>();
		search(arr, 0, sc.nextInt(), list);
		System.out.println(list);
	}

	public static void search(int[] arr, int n, int x, ArrayList<Integer> list) {
		if (n == arr.length) {
			return;
		}
		if (arr[n] == x) {
			list.add(n);
		}

		search(arr, n + 1, x, list);

	}

}
