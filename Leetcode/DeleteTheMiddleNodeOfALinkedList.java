package com.Leetcode;

public class DeleteTheMiddleNodeOfALinkedList {

	
	
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
	    public ListNode deleteMiddle(ListNode head) {
	    	 ListNode slow=head;
		        ListNode fast=head.next.next;
		        while(fast!=null&&fast.next!=null){
		            slow=slow.next;
		            fast=fast.next.next;
		        }
		        ListNode pointer=slow.next.next;
		        slow.next=pointer;
		        return slow;
		        
		        
	        
	    }
	}

}
