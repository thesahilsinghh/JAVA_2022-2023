package com.DivideNConquer;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ae = {  3,5,2,6,1,4 };
		QuickSort(ae, 0, ae.length-1);
		for (int i = 0; i < ae.length; i++) {
			System.out.print(ae[i]+" ");
		}
	}
	
	public static void QuickSort(int []arr,int lo,int hi) {
		if(lo>=hi) {
			return;
		}
		
		int mi=partition(arr, lo, hi);
		QuickSort(arr, lo, mi-1);
		QuickSort(arr, mi+1, hi);
	}

	public static int partition(int[] arr,int lo,int hi) {
		
		int pivot=arr[hi];
		int idx = lo;

		for (int i = lo; i < hi; i++) {
			if (arr[i] <= pivot) {
				int t = arr[i];
				arr[i] = arr[idx];
				arr[idx] = t;
				idx++;
			}

		}

		int t = arr[hi];
		arr[hi] = arr[idx];
		arr[idx] = t;
		
		return idx;

	}

}
