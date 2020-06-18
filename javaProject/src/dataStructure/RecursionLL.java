package dataStructure;

public class RecursionLL {
	
	public static Node head;
	
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
		 
		 if(n==0) {
			 temp.next=head;
			 head=temp;
			 return;
		 }
		 
		 Node temp2 = head;
		 for(int i=0; i<n-1;i++) {
			 temp2 = temp2.next;
		 }
		 temp.next = temp2.next;
		 temp2.next = temp;
	 }

public class Node{
	int data;
	Node next;
	
	public Node(int d) {
		this.data=d;
		next =null;
	}
}

 void print(Node head) {
	 if(head==null)return;
	 System.out.print(head.data + " ");
	 print(head.next);
 }
 
 void Reverseprint(Node head) {
	 if(head==null) {
		 return;
		 }
	 Reverseprint(head.next);
	 System.out.print(head.data + " ");
 }
 
 public static void main(String[] args) {
		
		RecursionLL rll = new RecursionLL();
		rll.add(18);
		rll.add(12);
		rll.add(3);
		rll.add(24);
		rll.add(11);
		rll.print(head);
		System.out.println();
		rll.Reverseprint(head);
}
}
