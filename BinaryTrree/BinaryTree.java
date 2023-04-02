package com.BinaryTrree;

import java.util.Scanner;

public class BinaryTree {

	Scanner sc = new Scanner(System.in);

	private class Node {
		int val;
		Node left;
		Node right;

	}

	Node root;

	public BinaryTree() {
		this.root = CreateTree();
	}

	private Node CreateTree() {

		int data = sc.nextInt();
		Node nn = new Node();
		nn.val = data;
		boolean lc = sc.nextBoolean();
		if (lc) {// Has left Child??
			nn.left = CreateTree();
		}
		boolean rc = sc.nextBoolean();
		if (rc) {// Has right Child??
			nn.right = CreateTree();
		}
		return nn;

	}

	public void Display() {
		Display(this.root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}

		String str = "";
		str = "<----" + nn.val + "---->";
		if (nn.left != null) {
			str = nn.left.val + str;
		}
		if (nn.right != null) {
			str = str + nn.right.val;
		}
		System.out.println(str);

		Display(nn.left);
		Display(nn.right);
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int lft = max(nn.left);
		int rgt = max(nn.right);
		return Math.max(lft, Math.max(rgt, nn.val));
	}

	public int min() {
		return min(this.root);
	}

	private int min(Node nn) {
		if (nn == null) {
			return Integer.MAX_VALUE;
		}
		int lft = min(nn.left);
		int rgt = min(nn.right);
		return Math.min(lft, Math.min(rgt, nn.val));
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.val == item) {
			return true;
		}
		return find(nn.left, item) || find(nn.right, item);
	}

	public int height() {
		return height(this.root);
	}

	private int height(Node nn) {
		if (nn == null) {
			return -1;
		}

		int lft = height(nn.left);
		int rgt = height(nn.right);
		return Math.max(lft, rgt) + 1;
	}
}
