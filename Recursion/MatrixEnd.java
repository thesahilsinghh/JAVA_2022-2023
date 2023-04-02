package com.Recursion;

public class MatrixEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(2, 2, 0, 0, "");

	}

	public static void print(int er, int ec, int br, int bc, String ans) {

		if (bc == ec && br == er) {
			System.out.println(ans);
			return;
		}
		if(br>er||bc>ec) {
			return;
		}

		
			print(er, ec, br + 1, bc, ans + "R");
		
		
			print(er, ec, br, bc + 1, ans + "C");
		

	}

}
