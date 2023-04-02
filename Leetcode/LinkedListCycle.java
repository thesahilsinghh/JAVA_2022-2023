package com.Leetcode;

import com.Leetcode.DeleteTheMiddleNodeOfALinkedList.ListNode;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class Solution {
		
		//floyd cycle detection algorithm
		public boolean hasCycle(ListNode head) {

			
			ListNode slow = head;
			ListNode fast = head;

			while (fast != null || fast.next != null) {
				slow = head.next;
				fast = head.next.next;
				if(slow==fast) {
					return true;
				}
			}
			return false;
		}
	}

}
