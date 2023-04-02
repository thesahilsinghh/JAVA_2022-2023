package com.DivideNConquer;

public class MergeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 7, 15, 7 };
		int[] ssn = sort(arr, 0, arr.length-1);
		for (int i = 0; i < ssn.length; i++) {
			System.out.print(ssn[i] + " ");
		}
	}

	public static int[] sort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] a = { arr[lo] };
			return a;
		}

		int mi = (lo + hi) / 2;

		int[] fs = sort(arr, lo, mi);
		int[] sc = sort(arr, mi + 1, hi);
		return merge(fs, sc);

	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int frst = arr1.length;
		int scnd = arr2.length;
		int[] ans = new int[frst + scnd];

		int x = 0;
		int y = 0;
		int i = 0;
		while (x < frst && y < scnd) {
			if (arr1[x] <= arr2[y]) {
				ans[i] = arr1[x];
				x++;
			} else {
				ans[i] = arr2[y];
				y++;
			}
			i++;
		}

		while (x < frst) {
			ans[i] = arr1[x];
			x++;
			i++;
		}
		while (y < scnd) {
			ans[i] = arr2[y];
			y++;
			i++;
		}
		return ans;
	}

}
