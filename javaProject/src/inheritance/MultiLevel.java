package inheritance;

public class MultiLevel {

	public static void main(String[] args) {
		
		C obj =	new C();
		obj.print_geeks();
		obj.print_for();
		obj.geeks();

	}
}	
	class A{
		public void geeks() {
			System.out.println("A");
		}
	}
	
	class B extends A{
		public void print_for() {
			System.out.println("B");
		}
	}
		class C extends B{
			public void print_geeks() {
				System.out.println("C");
			}
		}


