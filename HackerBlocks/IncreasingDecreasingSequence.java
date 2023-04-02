package com.HackerBlocks;

public class IncreasingDecreasingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5 };
		sequence(arr);

	}

	public static boolean sequence(int[] arr) {

		int i = 0;
		
			while (arr[i] < arr.length && arr[i] < arr[i + 1]) {
				i++;
			}

			while (arr[i] < arr[i + 1] && arr[i] < arr.length) {

				i++;

			}

		

		if (i < arr.length - 1) {
			return false;
		} else {
			return true;
		}
	}

}
