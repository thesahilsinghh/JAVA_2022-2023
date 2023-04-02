package com.Leetcode;

import com.Leetcode.DeleteTheMiddleNodeOfALinkedList.ListNode;

public class SortList {
	class Solution {
		public ListNode sortList(ListNode head) {
			if(head==null||head.next==null) {
				return head;
			}
			
			ListNode mid=middleNode(head);
			ListNode midH=mid.next;
			mid.next=null;
			ListNode a=sortList(head);
			ListNode b= sortList(midH);
			return mergeTwoLists(a, b);
		}

		public ListNode middleNode(ListNode head) {

			ListNode slow = head;
			ListNode fast = head;
			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;

		}
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode a = list1;
			ListNode b = list2;
			ListNode dummy = new ListNode();
			ListNode temp = dummy;

			while (a != null && b != null) {
				if(a.val<b.val) {
					temp=a;
					temp=temp.next;
					a=a.next;
				}else{
					temp=b;
					temp=temp.next;
					b=b.next;
				}
			}
			if(a!=null) {
				temp=a;
			}
			if(b!=null) {
				temp=b;
			}
			return dummy.next;
		}
	}

}
