package com.Queue;

public class Queue_reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue st = new Queue(5);
		st.enqueue(10);
		st.enqueue(20);
		st.enqueue(30);
		st.enqueue(40);
		st.enqueue(50);	
		st.display();
		reverse(st);
		st.display();

	}

	public static void reverse(Queue st) throws Exception {
		if (st.isempty()) {
			return;
		}

		int x = st.dequeue();

		reverse(st);
		st.enqueue(x);

	}

}
