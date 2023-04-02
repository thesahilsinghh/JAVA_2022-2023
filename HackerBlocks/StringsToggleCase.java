package com.HackerBlocks;

import java.util.Scanner;

public class StringsToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		change(sc.next());

	}
	
	
	public static void change(String str) {
		
		String ans="";
		
		
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>=97) {
				char s=(char)(str.charAt(i)-32);
				ans+=s;
			}
			
			if(str.charAt(i)<90) {
				char s=(char)(str.charAt(i)+32);
				ans+=s;

				
			}
		}
		
		System.out.println(ans);
	}

}
