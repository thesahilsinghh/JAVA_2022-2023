package com.HackerBlocks;

import java.util.Scanner;

public class ArraysSpiralPrintAnticlockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		print(arr);

	}

	public static void print(int[][] arr) {
		int loro = 0;
		int loco = 0;
		int hiro = arr.length - 1;
		int hico = arr[0].length - 1;
		int pr = arr.length * arr[0].length;
		int count = 0;
		while (count <= pr) {

			for (int i = loro; i <= hiro; i++) {
				System.out.print(arr[i][loro]+" ");
				count++;
			}
			loco++;
			
			for (int i = loco; i <=hico ; i++) {
				System.out.print(arr[hiro][i]+" ");
				count++;
			}
			hiro--;
			
			for (int i = hiro; i >=loro; i--) {
				System.out.print(arr[i][hico]+" ");
				count++;
			}
			
			hico--;
			
			for (int i = hico; i >=loco; i--) {
				System.out.print(arr[loro][i]+" ");
				count++;
			}
			loro++;
			

		}
	}

}
