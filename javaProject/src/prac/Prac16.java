package prac;

public class Prac16 {
	
	 static class SinglyLinkedListNode {
	        public int data;
	        public SinglyLinkedListNode next;

	        public SinglyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	        }
	    }	

	static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

	        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
	        SinglyLinkedListNode head = dummy;

	        while(head1 != null && head2 != null){
	            if(head1.data <= head2.data){
	                dummy.next = head1;
	                head1 = head1.next;
	            } else {
	                dummy.next = head2;
	                head2 = head2.next;
	            }
	            dummy = dummy.next;
	        }
	        if(head1 != null){
	            dummy.next = head1;
	        } else {
	            dummy.next = head2;
	        } 
	            return head.next;
	    } 
	
}
