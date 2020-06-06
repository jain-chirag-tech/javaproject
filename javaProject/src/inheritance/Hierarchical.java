package inheritance;

public class Hierarchical {

	public static void main(String[] args) {
		 three g = new three(); 		 
	     g.print();
	     g.print_geek();
	     
	     Two s = new Two();
	     s.print_geek();
	     s.print_for();
	     
	     
	}
}	
	
	class One 
	{ 
	    public void print_geek() 
	    { 
	        System.out.println("Geeks"); 
	    } 
	} 
	  
	class Two extends One 
	{ 
	    public void print_for() 
	    { 
	        System.out.println("for"); 
	    } 
	} 
	  
	class three extends One 
	{ 
	   public void print() {
		   System.out.println("print");
	   }
	} 


