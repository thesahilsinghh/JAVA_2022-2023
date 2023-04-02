package DynamicStack;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		SizeStack p = new SizeStack();
		p.push(10);
		p.push(20);
		p.display();
		p.push(30);
		p.push(40);
		p.push(50);
		p.push(60);
		System.out.println(p.peek());
		p.display();
	}

}
