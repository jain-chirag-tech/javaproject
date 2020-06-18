package stack;

public class StackImplement {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data) {
			this.data=data;
			next = null;
		}
	}
	
	void push(int data) {
		Node toAdd = new Node(data);
		if(head==null) {
			head = toAdd;		
		}
		else {
			Node temp = head;
			head = toAdd;
			toAdd.next = temp;
		}
		System.out.println(data + " Pushed to Stack ");
	}
	
	int pop() {
		int temp=Integer.MIN_VALUE;
		if(head==null) {
			System.out.println("Stack is Empty");
		}else {
			temp = head.data;
			head=head.next;
		}
		return temp;		
	}
	
	void peek() 
    { 
        if (head == null) { 
            System.out.println("Stack is empty"); 
        } 
        else { 
            System.out.println("Top element is " + head.data); 
        } 
    } 
	
	public static void main(String [] args) {
		StackImplement si = new StackImplement();
		si.push(18);
		si.push(12);
		si.push(24);
		si.push(11);
		si.push(3);
		si.push(7);
		si.peek();
		System.out.println(si.pop() + " popped from stack"); 
		si.peek();		
	}

}
