package com.Set;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer>st=new HashSet<>();

		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(40);
		st.add(50);
		System.out.println(st);
		
		
		//Tree set

		TreeSet<Integer>st1=new TreeSet<>();
		st1.add(50);
		st1.add(30);
		st1.add(50);
		st1.add(10);
		st1.add(90);
		st1.add(40);
		System.out.println(st1);
		
		
		
		//Linked set
		
		LinkedHashSet<Integer>st2=new LinkedHashSet<>();
		st2.add(null);
		st2.add(50);
		st2.add(30);
		st2.add(50);
		st2.add(10);
		st2.add(90);
		st2.add(40);
		System.out.println(st2);
		
		
		
		
	}

}
