package prac;

public class A {

	public static void main(String[] args) {
		
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		A obj4 = new A();
		A obj5 = new A();
		A obj6 = new A();
		obj1.counter();

	}

	
	static int i ;	
	public A() {
					i++;
			    }
	public void counter() {
		System.out.println(i);
	}
	
}
	


