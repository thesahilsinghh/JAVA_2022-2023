package com.Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class DiagonalTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		findDiagonalOrder(arr);

	}

	public static int[] findDiagonalOrder(int[][] mat) {

		int n = mat.length;
		int m = mat[0].length;
		int[] ans = new int[n * m];
		int x = 0;

		for (int i = 0; i < n + m - 1; i++) {
			int ro = 0;
			int co = 0;

			if (i < m) {
				ro = 0;
				co = i;

			} else {
				ro = i - m + 1;
				co = m - 1;
			}

			ArrayList<Integer> list = new ArrayList<>();

			while (ro < n && co >= 0) {

				list.add(mat[ro][co]);
				ro++;
				co--;
			}
			if (i % 2 == 0) {
				Collections.reverse(list);
			}

			for (int val : list) {
				ans[x] = val;
				x++;
			}

		}

		return ans;

	}

}
