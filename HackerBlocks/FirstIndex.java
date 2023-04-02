package com.HackerBlocks;

import java.util.Scanner;

public class FirstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int []arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(search(arr, 0, sc.nextInt()));
	}

	public static int search(int[] arr, int n, int x) {
		if (n == arr.length) {
			return -1;
		}
		if (arr[n] == x) {
			return n;
		}

		return search(arr, n + 1, x);

	}

}
