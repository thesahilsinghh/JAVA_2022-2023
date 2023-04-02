package com.Sortings;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 2, 5, 1, 4 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sort(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j < arr.length - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int te = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = te;

				}
				
				

			}
		}
	}

}
