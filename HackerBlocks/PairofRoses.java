package com.HackerBlocks;

import java.util.Scanner;

public class PairofRoses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		
		
		for (int l = 0; l < k; l++) {
			
		
		int n= sc.nextInt();
		int [] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		rose(arr, t);
		}
	}

	public static void rose(int[] arr, int t) {
		int a=0;
		
		int b=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==t) {
					int temp=Math.min(Math.max(a, b)-Math.min(a, b),Math.max(arr[i],arr[j])-Math.min(arr[i],arr[j]));
					if(temp==Math.max(arr[i],arr[j])-Math.min(arr[i],arr[j])) {
						a=arr[i];
						b=arr[j];
					}
				}
			}
		}
		
		System.out.println("Deepak should buy roses whose prices are "+a+" and "+b+".");
	}
}
