//Write a function to delete a node (except the tail) in a singly linked list,
//given only access to that node.

package leetcode;

public class L2 {
	
	 // Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	     ListNode(int x) { val = x; }
	  }
	 
	class Solution {
	    public void deleteNode(ListNode node) {
	        ListNode nextNode = node.next;
	        
	        if (nextNode != null) {  
	        node.val = nextNode.val;
	        node.next = nextNode.next;
	        nextNode = null;             
	        }
	    }
	}

}
