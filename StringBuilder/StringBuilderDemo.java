package com.StringBuilder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sc= new StringBuilder();
		
		System.out.println(sc.capacity());
		sc.append("qqqqqqqqqqqqqqqqqq");
		System.out.println(sc.capacity());
	}

}
