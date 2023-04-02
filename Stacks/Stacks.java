package com.Stacks;

import java.util.*;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		pushButton(st, 80);
		System.out.println(st);

	}

	public static void pushButton(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}

		int x = st.pop();
		pushButton(st, item);
		st.push(x);
	}

}
