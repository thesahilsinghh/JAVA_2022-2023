package com.Leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int reverse(int x) {
	        
	        if(x==0|| x >= Math.pow(2, 31) - 1 || x < Math.pow(2, 31) * -1){
	            return 0;
	        }
	        long as = 0;
			while (x > 0) {
				int i = x % 10;
				as=as*10+i;
				x /= 10;
			}
			while (x < 0) {
				int i = x % 10;
				as=as*10+i;
				x /= 10;
			}
	        if (as >= Math.pow(2, 31) - 1 || as < Math.pow(2, 31) * -1) {
				return 0;
			}
	        
	        return (int)as;
	    }
}
