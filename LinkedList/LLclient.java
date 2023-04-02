package LinkedList;

import LinkedList.Linked_List;

public class LLclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Linked_List ll = new Linked_List();
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);
		ll.display();
		ll.addlast(00);
		ll.addlast(-10);
		ll.display();
		
		System.out.println(ll.getfirst());
		System.out.println(ll.getlast());
		System.out.println(ll.getatindex(3));
		System.out.println(ll.removefirst());
		System.out.println(ll.removelast());
		ll.display();
		ll.addAtIndex(2, 77);
		ll.display();
		ll.addAtIndex(3, 80);
		ll.display();
		
		
	}

}
