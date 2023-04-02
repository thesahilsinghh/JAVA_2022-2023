package com.Leetcode;

import com.Leetcode.DeleteTheMiddleNodeOfALinkedList.ListNode;

public class IntersectionofTwoLinkedLists {
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
	    	ListNode a= headA;
	    	ListNode b= headB;
	    	while(a!=b) {
	    		if(a==null) {
	    			a=headB;
	    		}
	    		else {
	    			a=a.next;
	    		}
	    		if(b==null) {
	    			b=headA;
	    		}
	    		else {
	    			b=b.next;
	    		}
	    	}
	    	return a;
	    }
	}
}
