//Reverse a singly linked list.
//
//Example:
//
//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL

package leetcode;

public class L1 {
	
	
	 // Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	class Solution {
	    public ListNode reverseList(ListNode head) {
	        ListNode prev,next,current;
	        prev=null;
	        current=head;
	        while(current!=null){
	             next=current.next;
	            current.next=prev;
	            prev=current;
	            current=next;
	        }
	        head=prev;
	        return head;
	    }
	}

}
