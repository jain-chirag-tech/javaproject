package dataStructure;

public class MyLinkedList {
	
	Node head;
	
	 void add(int d) {
		Node toAdd = new Node(d);
	    Node temp = head;
	    
	    if(head == null) {
			head =toAdd;
			return ;
		}
	    
	    while(temp.next != null) {
	    	temp = temp.next;
	    }	    
	    temp.next = toAdd;
	}
	
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	
	static class Node{
		int data;
		Node next;
		
		public Node(int d) {
			this.data=d;
			next =null;
		}
	}

}
