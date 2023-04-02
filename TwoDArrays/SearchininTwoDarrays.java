package com.TwoDArrays;

public class SearchininTwoDarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr={	{1,4,7,11,15},
						{2,5,8,12,19},
						{3,6,9,16,22},
						{10,13,14,17,24},
						{18,21,23,26,30}};
		System.out.println(search(arr, 5));

	}

	public static boolean search(int[][] matrix, int target) {

		int ro = 0;
		int co = matrix[0].length - 1;
		System.out.println(co);
		int n = matrix.length - 1;
		System.out.println(n);

		while (ro <= n && co >= 0) {

			if (matrix[ro][co] == target) {
				return true;
			}

			else if (matrix[ro][co] > target) {
				co--;
			}

			else {
				ro++;
			}
		}

		return false;

	}

}
