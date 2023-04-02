package com.Recursion;

public class PrintSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printt(5);
//		increase(5);
	}

	public static void printt(int i) {

		if (i == 0) {
			return;
		}

		System.out.println(i);

		printt(i - 1);
		System.out.println(i);

	}
	
	public static void increase(int i) {
		if(i==0) {
			return;
		}
		
		
		
		increase(i-1);
		System.out.println(i);
	}

}
