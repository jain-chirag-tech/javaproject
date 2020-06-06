package inheritance;

public class SingleInheritance {
	
	
	public static void main(String[] args) {
		
		Y c = new Y();
		c.display();
		c.print();
		c.print();
		
//		one c = new one();
//		c.print();
//		c.print();
//		c.print();
	}
}
	
	class X{
		public void print() {
			System.out.println("Parent Class");
		}
	}	
		
	class Y extends X{
		public void display() {
			System.out.println("Child Class");
		}
	}
