package prac;

public class Queue {
	
	static final int MAX_SIZE = 10;
	
		static int[] A = new int[MAX_SIZE];
		static int front;

		static int rear; 
	
		Queue()
		{
			front = -1; 
			rear = -1;
		}
		
		boolean IsEmpty()
		{
			return (front == -1 && rear == -1); 
		}
		
		boolean IsFull()
		{
			return (rear+1)%MAX_SIZE == front ? true : false;
		}
		
		void Enqueue(int x)
		{
			System.out.println("enqueuing " + x + "\n");
			if(IsFull())
			{
				System.out.println("Error: Queue is Full\n");
				return;
			}
			if (IsEmpty())
			{ 
				front = rear = 0; 
			}
			else
			{
			    rear = (rear+1)%MAX_SIZE;
			}
			A[rear] = x;
		}
		
		void Dequeue()
		{
			System.out.println("Dequeuing \n");
			if(IsEmpty())
			{
				System.out.println("Error: Queue is Empty\n");
				return;
			}
			else if(front == rear ) 
			{
				rear = front = -1;
			}
			else
			{
				front = (front+1)%MAX_SIZE;
			}
		}
		
		void Front()
		{
			if(front == -1)
			{
				System.out.println("Error: cannot return front from empty queue\n");
				return; 
			}
			System.out.println(A[front]);
		}
		
		static void print() {
			for(int i=front ; i<=rear ;i=(i+1)%MAX_SIZE) {
				System.out.print(A[i]+ " " );
			}		
			System.out.println();
		}	 

		public static void main(String[] args) {
			 Queue q= new Queue();
			 
			 q.Enqueue(2);	print();
			 q.Enqueue(4);	print();
			 q.Enqueue(6);  print();
			 q.Dequeue();	print();
			 q.Enqueue(7);  print();
			 q.Front();  
			 q.Enqueue(18); print();


		}
}
