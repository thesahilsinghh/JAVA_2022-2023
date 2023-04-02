package com.Sortings;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 2, 5, 1, 4 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	public static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int p = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[p]) {
					p = j;
				}
			}

			int t = arr[i];
			arr[i] = arr[p];
			arr[p] = t;

		}
	}

}
