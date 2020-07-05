//Delete duplicate-value nodes from a sorted linked list

package prac;

public class Prac22 {


    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

        SinglyLinkedListNode temp = head;
        
        if(head==null || head.next==null) return head;
        while(head.next != null){
            if(head.data != head.next.data){
                head =head.next;
            } else {
                head.next = head.next.next;
            }
        }
            return temp;
     }
	
}
