package com.Queue;

public class Queue {

	protected int[] arr;
	private int size = 0;
	protected int top = 0;

	public Queue(int cap) {
		arr = new int[cap];
	}

	public Queue() {
		arr = new int[5];
	}

	public int getfront() {
		return arr[this.top];
	}

	public int size() {
		return this.size;
	}

	public boolean isfull() {
		return this.size == arr.length;
	}

	public boolean isempty() {
		return this.size == 0;
	}

	public void enqueue(int x) throws Exception {
		if (isfull()) {
			throw new Exception("queue capacity is full");
		}

		this.arr[(this.size + this.top) % (this.arr.length)] = x;
		this.size++;
	}

	public int dequeue() throws Exception {
		if (isempty()) {
			throw new Exception("xxxx");
		}

		int rv = this.arr[this.top];
		this.arr[this.top] = 0;
		this.top = (this.top + 1) % this.arr.length;
		this.size--;
		return rv;

	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			int idx = (this.top + i) % this.arr.length;
			System.out.print(this.arr[idx] + " |");

		}
		System.out.println();
	}

}
