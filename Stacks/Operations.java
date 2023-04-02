package com.Stacks;

public class Operations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DemoArrays n = new DemoArrays(5);

		n.push(10);
		n.size();
		n.display();
		n.push(20);
		n.push(30);
		n.push(40);
		n.push(50);
		n.display();
		System.out.println(n.isfull());
		n.pop();
		n.pop();
		n.display();
		System.out.println(n.isfull());
		System.out.println(n.peek());
		n.push(80);
		n.push(60);
		n.push(67);
		n.push(89);
	}

}
