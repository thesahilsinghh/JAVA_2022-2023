package com.Recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(pow(2,5));
	}

	public static int pow(int i, int j) {
		
		if(j==0) {
			return 1;
		}
		
		
		int n=pow(i, j-1);
		return i*n;
		
	}

}
