//Merge two sorted linked lists and return it as a new sorted list.
//The new list should be made by splicing together the nodes of the first two lists.

package leetcode;

public class L4 {
	
	// Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode dummy = new ListNode(0);
	        ListNode head = dummy;
	        
	        while(l1!=null && l2!=null){
	            if(l1.val <= l2.val){
	                dummy.next = l1;
	                l1 = l1.next;
	            } else {
	                dummy.next = l2;
	                l2 = l2.next;
	            }
	            dummy = dummy.next;            
	        }
	        if(l1!=null){
	            dummy.next = l1;
	        } else {
	            dummy.next = l2;
	        }
	        return head.next;
	    }
	}

}
