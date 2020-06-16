package stack;

public class StackMain {
	
	public static void main(String [] args) {
		ArrayImplement s = new ArrayImplement(); 
		
		boolean a=s.isEmpty();
		System.out.println(a);
		s.push(3);s.print();
		s.push(18);s.print();
		s.push(12);s.print();
		s.push(30);s.print();
		s.peek();
		s.push(11);
		s.print();
	}

}
