package prac;

public class Prac15 {

	
	 // Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
	  public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	         int ACount =0;
	    int BCount=0;
	    ListNode A=headA;
	    ListNode B=headB;
	    while(A!=null){
	        ACount++;
	        A=A.next;
	    }
	    
	     while(B!=null){
	        BCount++;
	        B=B.next;
	    }
	    
	    int diff= Math.abs(ACount-BCount);
	    A=headA;
	    B=headB;
	    if(ACount>BCount){
	        while(diff>0){
	            A=A.next;
	            diff--;
	        }
	    }else{
	        while(diff>0){
	            B=B.next;
	            diff--;
	        }
	    }
	    
	    while(A!=B){
	        A=A.next;
	        B=B.next;
	    }
	    
	    return A;
	    }
	}
	
}
