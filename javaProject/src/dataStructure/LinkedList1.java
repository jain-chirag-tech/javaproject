//Find the middle of a given linked list...

package dataStructure;

public class LinkedList1 {
	
	Node head;
	
	 class Node 
	    { 
	        int data; 
	        Node next; 
	        Node(int d) 
	        { 
	            data = d; 
	            next = null; 
	        } 
	    }
	 
	  void printMiddle() 
	    { 
	        Node slow_ptr = head; 
	        Node fast_ptr = head; 
	        
	            while (fast_ptr != null && fast_ptr.next != null) 
	            { 
	                fast_ptr = fast_ptr.next.next; 
	                slow_ptr = slow_ptr.next; 
	            } 
	            System.out.println("The middle element is " + 
	                                slow_ptr.data + " \n"); 
	    } 
	  
	  public void push(int new_data) 							//inserting at front 
	    { 
	        Node new_node = new Node(new_data); 
	        new_node.next = head;
	        head = new_node; 
	    } 
	  
	  void print() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " " );
				temp = temp.next;
			}
			System.out.println();
		}

	public static void main(String[] args) {
		
		LinkedList1 llist = new LinkedList1(); 
		
		llist.push(18);
		llist.push(12);
		llist.push(24);
		llist.push(30);
		llist.push(11);
		llist.push(3);
		llist.push(29);
		llist.push(50);
		llist.print();
		llist.printMiddle();
	}
}
