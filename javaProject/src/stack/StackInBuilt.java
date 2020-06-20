package stack;
import java.util.Stack;
public class StackInBuilt {

	public static void main(String[] args) {
		Stack <Integer> s = new Stack<Integer>();
		System.out.println(s.isEmpty());
		s.push(18);
		s.push(24);
		s.push(11);
		s.push(12);
		System.out.println("popped element: "+ s.pop());
		s.push(30);
		s.insertElementAt(15, 2);
		s.insertElementAt(10, 0);
		s.push(7);
		System.out.println(s.peek());
		s.push(3);
		s.push(3);s.push(3);s.push(3);
		s.trimToSize();
		s.capacity();
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println();
		
	}

}
