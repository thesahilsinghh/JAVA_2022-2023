package com.Stacks;

public class StackUsingQueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		StackUsingQueue st = new StackUsingQueue();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40); 
		st.push(50);
		st.display();
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.isEmpty());

	}

}
