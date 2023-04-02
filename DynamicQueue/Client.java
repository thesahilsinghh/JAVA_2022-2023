package DynamicQueue;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		SizeQueue q= new SizeQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.dequeue();
		q.dequeue();
		q.enqueue(40);
		q.enqueue(50);
		System.out.println(q.isfull());
		q.enqueue(60);
		q.enqueue(60);
		q.enqueue(60);
		q.enqueue(60);
		
		q.display();
		System.out.println(q.getfront());

	}

}
