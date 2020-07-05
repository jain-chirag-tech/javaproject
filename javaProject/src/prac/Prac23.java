package prac;

public class Prac23 {

	  static class SinglyLinkedListNode {
	        public int data;
	        public SinglyLinkedListNode next;

	        public SinglyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	        }
	    }
	  
	    static boolean hasCycle(SinglyLinkedListNode head) {

	        SinglyLinkedListNode slow = head;
	        SinglyLinkedListNode fast = head.next;

	        while(fast != null && fast.next != null){
	            if(slow == fast){
	                return true;
	            } else {
	                slow = slow.next;
	                fast = fast.next.next;
	            }
	        }
	            return false;
	    }
	
}
