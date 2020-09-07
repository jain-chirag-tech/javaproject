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
