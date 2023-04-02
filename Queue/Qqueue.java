package com.Queue;

public class Qqueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Queue qq= new Queue();
		qq.enqueue(10);
		qq.enqueue(20);
		qq.enqueue(30);
		//qq.dequeue();
		qq.enqueue(40);
		qq.enqueue(50);
		qq.display();
		System.out.println(qq.getfront());
		System.out.println(qq.isempty());
		System.out.println(qq.isfull());
	}

}
