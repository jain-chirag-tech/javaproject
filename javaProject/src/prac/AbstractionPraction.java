package prac;

public class AbstractionPraction {

	public static void main(String[] args) {
	
		P obj1 = new P();
		obj1.show();
		

	}
}

   abstract class Alpha{
	   public abstract void show();
	   public abstract void display();
	   
   }



	class P extends Alpha{
		public void show() {
		    System.out.println("Hello");
		  }

		@Override
		public void display() {
			// TODO Auto-generated method stub
			
		}
	}
	
    class Q extends Alpha{
    	public void display() {
    		System.out.println("Hi");
    	}

		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}    	
    }
