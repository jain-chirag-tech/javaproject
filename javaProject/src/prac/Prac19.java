/*You’re given the pointer to the head node of a linked list 
 * and a specific position. Counting backwards from the tail node of the linked list
 * , get the value of the node at the given position. A position of 0 
 * corresponds to the tail, 1 corresponds to the node before the tail and so on.
 */

package prac;

public class Prac19 {

	 static class SinglyLinkedListNode {
	        public int data;
	        public SinglyLinkedListNode next;

	        public SinglyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	        }
	    }
	 
	 static int getNode(SinglyLinkedListNode head, int positionFromTail) {
	        int index = 0;
	        SinglyLinkedListNode temp=head;
	        SinglyLinkedListNode result = head;
	        while(temp!=null){
	           temp=temp.next;
	           if(index++>positionFromTail){
	               result=result.next;
	           }     
	        }
	           return result.data;
	    }
	
}
