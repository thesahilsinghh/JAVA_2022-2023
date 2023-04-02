package LinkedList;

import LinkedList.Linked_List.node;

public class CycleRemoval {

	public class node {

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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
