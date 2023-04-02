package com.Queue;

public class QueueUsingStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		QueueUsingStack qq = new QueueUsingStack();
		qq.enqueue(10);
		qq.enqueue(20);
		qq.enqueue(30);
		qq.enqueue(40);
		qq.enqueue(50);
		qq.display();
		System.out.println(qq.dequeue());
		System.out.println(qq.peek());
	}

}
