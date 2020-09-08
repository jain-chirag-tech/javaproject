/*
 Input:
LinkedList = 1->2->4
key = 3
Output: 1 2 3 4
Explanation: The new element is inserted
after the current middle element in the
linked list.
Example 2:

Input:
LinkedList = 10->20->40->50
key = 30
Output: 10 20 30 40 50
Explanation: The new element is inserted
after the current middle element in the
linked list and Hence, the output is
10 20 30 40 50.
 */

package chirag;

public class InsertInMid {
	
	class Node {
	    int data;
	    Node next;
	    
	    public Node(int data){
	        this.data = data;
	        this.next = null;
	    }
	}
	
	class Solution {
	    
	    public Node insertInMid(Node head, int data){
	        Node temp = new Node(data);
	        if(head==null){
	            head=temp;
	            return head;
	        }
	        if(head.next == null){
	            head.next=temp;
	            return head;
	        }
	        Node slow = head;
	        Node fast = head;
	        while(fast.next!=null&&fast.next.next!=null){
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        temp.next = slow.next;
	        slow.next = temp;
	        return head;
	    }
	}
}
