package com.Stacks;

public class DemoArrays {

	protected int[] arr;
	private int top = -1;

	public DemoArrays(int n) {
		this.arr = new int[n];
	}

	public DemoArrays() {
		this.arr = new int[5];
	}

	public void push(int x) throws Exception {

		if (isfull()) {
			throw new Exception("stack full");
		}
		top++;
		arr[top] = x;
	}

	public int pop() {
		int x = arr[top];
		arr[top] = 0;
		top--;
		return x;
	}

	public int size() {
		return (top + 1);
	}

	public void display() {

		for (int i = 0; i <= top; i++) {
			System.out.print("| " + arr[i] + " |");
		}
		System.out.println();
	}

	public boolean isempty() {
		return top == -1;
	}

	public boolean isfull() {
		return top == arr.length - 1;
	}

	public int peek() {
		return arr[top];

	}

}
