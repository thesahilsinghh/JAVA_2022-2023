package com.Stacks;

import DynamicQueue.dynamicQueue;

public class StackUsingQueue {

	protected dynamicQueue data;

	public StackUsingQueue() {
		this.data = new dynamicQueue();
	}

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.data.isempty();
	}

	public void push(int x) throws Exception {
		dynamicQueue temp = new dynamicQueue();

		while (!this.data.isempty()) {
			temp.enqueue(this.data.dequeue());
		}
		this.data.enqueue(x);
		while (!temp.isempty()) {
			this.data.enqueue(temp.dequeue());
		}
	}

	public int peek() {
		return this.data.getfront();
	}

	public int pop() throws Exception {
		return this.data.dequeue();
	}

	public void display() {
		this.data.display();
	}
}
