package stack;

public class ArrayImplement {
	
	
	static final int MAX = 101;
	static int arr[] = new int [MAX];
	int top = -1;
	
	boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	void push(int x) {
		if(top>=MAX-1) {
			System.out.println("Stack Overflow");
		}
		top++;
		arr[top]=x;
	}
	
	void pop(){
		if(top<0) {
			System.out.println("Stack Underflow");
		}
		top--;
	}
	
	void peek() {
		System.out.println(arr[top]);
	}
	
	void print() {
		System.out.print("Stack : ");
		for(int i = 0;i<=top;i++) {
			System.out.print( arr[i] + " ");
		}
		System.out.println();
	}
}
