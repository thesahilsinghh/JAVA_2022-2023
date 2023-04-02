package LinkedList;

public class Linked_List {

	private class node {

		int data;
		node next;

		public node(int data) {
			// TODO Auto-generated constructor stub

			this.data = data;
		}

	}

	private node head;
	private int size;
	private node tail;

	public void addfirst(int item) {
		node nn = new node(item);
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {

			nn.next = this.head;
			this.head = nn;
			size++;
		}

	}

	public void display() {

		node temp = head;
		while (temp != null) {

			System.out.print(temp.data + " |");
			temp = temp.next;
		}
		System.out.println();
	}

	public void addlast(int item) {
		if (size == 0) {
			addfirst(item);
		} else {

			node temp = new node(item);
			this.tail.next = temp;
			this.tail = temp;
			size++;
		}

	}

	public int getfirst() throws Exception {
		if (size == 0) {
			throw new Exception("Linked list is empty");

		} else {
			return this.head.data;
		}
	}

	public int getlast() throws Exception {
		if (size == 0) {
			throw new Exception("Linked list is empty");

		} else {
			return this.tail.data;
		}
	}

	public int getatindex(int k) throws Exception {
		return getNode(k).data;
	}

	private node getNode(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("index out of bound");
		}
		node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public int removefirst() throws Exception {
		if (size == 0) {
			throw new Exception("Linked list is empty");

		}
		node temp = this.head;
		this.head = this.head.next;
		size--;
		temp.next = null;
		return temp.data;
	}

	public int removelast() throws Exception {
		if (size == 0) {
			throw new Exception("Linked list is empty");

		}
		if (size == 1) {
			removefirst();
		}
		node temp = getNode(this.size - 2);

		int r = this.tail.data;
		this.tail = temp;
		this.tail.next = null;
		this.size--;
		return r;
	}

	public int removeAtIndex(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("index out of bound");
		}
		if (k == 0) {
			removefirst();
		}
		if (k == size - 2) {
			removelast();
		}

		node temp = getNode(k);
		node temp_1 = getNode(k - 1);

		int r = temp.data;
		temp_1.next = temp.next;
		temp.next = null;
		this.size--;
		return r;
	}

	public void addAtIndex(int k, int item) throws Exception {
		if (k < 0 || k > this.size) {
			throw new Exception("index out of bound");
		}
		if (k == 0) {
			addfirst(item);
		} else if (k == size) {
			addlast(item);
		} else {

			node temp = new node(item);

			node temp_1 = getNode(k - 1);

			temp.next = temp_1.next;
			temp_1.next = temp;

			this.size++;
		}

	}

}
