package com.HackerBlocks;

import java.util.Scanner;

public class PiyushandMagicalPark {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int m = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			char[][] arr = new char[n][m];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = sc.next().charAt(0);
				}

			}

			hello(arr, a, b);

		}

		public static void hello(char[][] arr, int a, int b) {

			int ro = 0;

			while (ro < arr.length && b > a) {

				for (int i = 0; i < arr[0].length; i++) {
					if (arr[ro][i] == '.') {
						b -= 2;
					}

					else if (arr[ro][i] == '*') {
						b += 5;
					} else if (arr[ro][i] == '#') {
						ro++;
						break;

					}
	            
					if (i == arr[0].length - 1) {
						ro++;
					} else {

						b--;
					}

				}
	        }
				
	        if(a>=b){
	            System.out.println("No");
	        }
	        else{
	            System.out.println("Yes");
	            System.out.println(b);
	        }
		
	}

}
