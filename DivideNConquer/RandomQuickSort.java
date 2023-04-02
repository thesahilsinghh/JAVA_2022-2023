package com.DivideNConquer;

public class RandomQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 4, 6, 9, 6, 4 };
		random(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void random(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}

		int mi = sort(arr, lo, hi);

		random(arr, lo, mi - 1);
		random(arr, mi + 1, hi);

	}

	public static int sort(int[] arr, int lo, int hi) {

		int pivot = arr[hi];
		int idx = lo;
		for (int i = lo; i < hi; i++) {
			if (arr[i] <= pivot) {

				int t = arr[i];
				arr[i] = arr[idx];
				arr[idx] = t;
				idx++;

			}
		}

		int t = arr[idx];
		arr[idx] = pivot;
		arr[hi] = t;
		return idx;

	}
}
