package prac;

public class Prac21 {

	  static class DoublyLinkedListNode {
	        public int data;
	        public DoublyLinkedListNode next;
	        public DoublyLinkedListNode prev;

	        public DoublyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	            this.prev = null;
	        }
	    }
	  
	  static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

	        DoublyLinkedListNode tmp = head;
	        while(tmp != null){
	            head = tmp;
	            tmp = head.next;
	            head.next = head.prev;
	            head.prev = tmp;
	        }
	            return head;
	         
	    }
	
}
