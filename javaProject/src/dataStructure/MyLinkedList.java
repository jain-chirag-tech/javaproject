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
	 
void insert(int data , int n) {
		 
		 Node temp = new Node(data);
		 
		 if(n==1) {
			 temp.next=head;
			 head=temp;
			 return;
		 }
		 
		 Node temp2 = head;
		 for(int i=1; i<n-1;i++) {
			 temp2 = temp2.next;
		 }
		 temp.next = temp2.next;
		 temp2.next = temp;
	 }
	 
	
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int d) {
			this.data=d;
			next =null;
		}
	}

}
