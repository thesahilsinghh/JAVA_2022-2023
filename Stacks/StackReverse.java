package com.Stacks;

import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		reverse(st);
		System.out.println(st);

	}

	public static void reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			return;
		}

		int x = st.pop();
		reverse(st);
		pushButton(st, x);

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
