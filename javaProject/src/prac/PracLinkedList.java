package prac;

public class PracLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
 		}
	}
	
	void add(int data) {
		Node temp = new Node(data);
		if(head==null) {
			head=temp;
			return;
		}
			Node temp2=head;
			while(temp2.next!=null) {
				temp2 = temp2.next;
			}
			temp2.next=temp;
		}	
	
	void insert(int data,int n) {
		Node temp = new Node(data);
		if(n==1) {
			head=temp;
			return;
		}
			Node temp2 = head;
			for(int i =1;i<n-1;i++) {
				temp2=temp2.next;
			}
			temp.next = temp2.next;
			temp2.next = temp;
		}
		
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}
//	void print(Node head) {
//		Node temp = head;
//		while(temp != null) {
//			System.out.print(temp.data + " ");
//			temp=temp.next;
//		}
//	}
	
	void delete(int n) {
		if(head==null) {
			return;
		}
		Node temp2 = head;
		for(int i =1;i<n-1;i++) {
			temp2=temp2.next;
		}
		Node temp = temp2.next;
		temp2.next = temp.next;
	}
}
	
//	Node reverse(Node head) {
//		Node current,prev,next;
//	    current = head;
//		prev= null;
//		while(current != null) {
//			next = current.next;
//			current.next=prev;
//			prev=current;
//			current=next;
//		}
//		head=prev;
//		return head;
//	}

