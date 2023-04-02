package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap<k, v> {

	public class Node {
		k key;
		v value;
		Node next;

		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(k key, v value) {
			this.key = key;
			this.value = value;
		}
	}

	private ArrayList<Node> bucketArr;

	private int size = 0;

	public Hashmap(int x) {

		this.bucketArr = new ArrayList<>();
		for (int i = 0; i < x; i++) {
			this.bucketArr.add(null);
		}
	}

	public Hashmap() {
		this(4);
	}

	public int hashfunction(k key) {
		int bn = key.hashCode() % bucketArr.size();

		if (bn < 0) {
			bn += this.bucketArr.size();
		}
		return bn;
	}

	public void put(k key, v value) {
		int bn = hashfunction(key);
		Node temp = this.bucketArr.get(bn);// 1st address
		while (temp != null) {

			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node nn = new Node(key, value);
		temp = this.bucketArr.get(bn);// 1st address
		nn.next = temp;
		this.bucketArr.set(bn, nn);
		this.size++;

		double lf = (1.0 * this.size) / this.bucketArr.size();
		double thf = 2.0;
		if (lf > thf) {
			rehasing();
		}
	}

	private void rehasing() {
		// TODO Auto-generated method stub

		ArrayList<Node> nn = new ArrayList<>();

		for (int i = 0; i < 2 * this.bucketArr.size(); i++) {
			nn.add(null);
		}
		ArrayList<Node> old = bucketArr;
		bucketArr=nn;
		this.size=0;
		for (Node node : old) {
			while (node != null) {
				this.put(node.key, node.value);
				node = node.next;
			}
		}
		
	}

	public v get(k key) {
		int bn = hashfunction(key);
		Node temp = this.bucketArr.get(bn);
		while (temp.next != null) {

			if (temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public boolean containskey(k key) {
		int bn = hashfunction(key);
		Node temp = this.bucketArr.get(bn);
		while (temp.next != null) {

			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public v remove(k key) {
		int bn = hashfunction(key);
		Node curr = this.bucketArr.get(bn);
		Node prev = null;
		while (curr != null) {

			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == prev) {
			return null;
		}

		this.size--;

		if (prev == null) {
			this.bucketArr.set(0, curr.next);
			curr.next = null;
		} else {
			prev.next = curr.next;
			curr.next = null;
		}
		return curr.value;
	}

	@Override
	public String toString() {

		String s = "{";
		for (Node node : this.bucketArr) {
			while (node != null) {
				s = s + node.key + "=" + node.value + ", ";
				node = node.next;
			}
		}

		s += "}";
		return s;
	}

}
