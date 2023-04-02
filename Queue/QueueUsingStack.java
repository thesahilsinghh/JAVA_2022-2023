package com.Queue;

import DynamicStack.dynamicStack;

public class QueueUsingStack {

	protected dynamicStack qq = new dynamicStack();

	public int size() {
		return this.qq.size();
	}

	public void display() {
		this.qq.display();
	}

	public void enqueue(int x) throws Exception {
		this.qq.push(x);
	}

	public int dequeue() throws Exception {

		dynamicStack temp = new dynamicStack();
		while (this.qq.size() != 1) {
			temp.push(this.qq.pop());
		}
		int i = this.qq.pop();

		while (!temp.isempty()) {
			this.qq.push(temp.pop());
		}
		return i;
	}

	public int peek() throws Exception {

		dynamicStack temp = new dynamicStack();
		while (this.qq.size() != 1) {
			temp.push(this.qq.pop());
		}
		int i = this.qq.peek();

		while (!temp.isempty()) {
			this.qq.push(temp.pop());
		}
		return i;
	}
}
