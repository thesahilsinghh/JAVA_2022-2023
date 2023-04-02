package com.HackerBlocks;

import java.util.*;

public class RatChasesItsCheese {
	static boolean xx = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] arr = new char[n][m];
		for (int i = 0; i < arr.length; i++) {
			String ll=sc.next();
			for (int j = 0; j < ll.length(); j++) {
				arr[i][j] = ll.charAt(j);
			}
			
		}

		int[][] ans = new int[5][4];
		run(arr, 0, 0, ans);
		if (xx = false) {
			System.out.println("NO PATH FOUND");
		}
		

	}

	public static void run(char[][] arr, int c, int r, int[][] ans) {
		if (c == arr[0].length - 1 && r == arr.length - 1) {
			if (arr[r][c] == 'O') {
				ans[r][c] = 1;
				display(ans);
				ans[r][c] = 1;
				xx = true;
				return;
			}
		}

		if (c < 0 || r < 0 || c >= arr[0].length || r >= arr.length || arr[r][c] == 'X') {
			return;
		}

		int[] cc = { 1, 0, -1, 0 };
		int[] rr = { 0, 1, 0, -1 };
		for (int i = 0; i < cc.length; i++) {
			arr[r][c] = 'X';
			ans[r][c] = 1;
			run(arr, c + cc[i], r + rr[i], ans);
			arr[r][c] = 'O';
			ans[r][c] = 0;
		}
	}

	public static void display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
