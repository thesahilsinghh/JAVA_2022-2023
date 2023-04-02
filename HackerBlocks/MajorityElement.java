package com.HackerBlocks;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stubi
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int [] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		majority(arr);
		

	}

	public static void majority(int[] arr) {

		int ans=0;
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i]==arr[i+1]) {
				ans=arr[i];
			}
		}
		
		System.out.println(ans);
	}
}
