package queue;

public class implementLL {
	
	node front = null;
	node rear = null;
	class node {
		int data;
		node next;
		node(int d){
			data = d;
			next=null;
		}
	}
	
	void enqueue(int x) {
		node temp = new node(5);
		if(front == null && rear == null) {
			rear = temp;
		}
		temp = rear.next;
		rear = temp;
	}
	void dequeue() {
		//node temp = front;
		if(front == null) {
			System.out.println(("Queue is Empty\n"));
			return;
		}
		if(front == rear) {
			front = rear = null;
		}
		else {
		front=front.next;
		}		
	}	

}
