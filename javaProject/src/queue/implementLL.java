package queue;

public class implementLL {
	
	static node front = null;
	static node rear = null;
	class node {
		int data;
		node next;
		node(int d){
			data = d;
			next=null;
		}
	}
	
	void enqueue(int x) {
		node temp = new node(x);
		if(front == null && rear == null) {
			front = rear = temp;
			return;
		}
		rear.next=temp;
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
	
	static void Print() {
		node temp = front;
		while(temp!=null) {
			System.out.print(temp.data +" ");
			temp=temp.next;
		}				
	}
	
	public static void main(String[] args) {
		implementLL qll = new implementLL ();
		
		qll.enqueue(12);
		qll.enqueue(18);
		qll.enqueue(1);
		qll.enqueue(24);
		qll.enqueue(18);
		qll.dequeue();
		qll.dequeue();
		Print();
	}
}
