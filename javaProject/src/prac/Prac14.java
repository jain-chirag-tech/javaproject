package prac;
import java.util.Vector;
public class Prac14 {

	public static void main(String[] args) {
		
		  Vector<Integer> v 
          = new Vector<Integer>(); 

      for (int i = 1; i <= 5; i++) 
          v.add(i); 

      System.out.println(v); 

      v.remove(0);
      v.remove(3); 
      
      System.out.println(v); 

      System.out.println(v.get(0));
      
      for (int i = 0; i < v.size(); i++) 
          System.out.print(v.get(i) + " "); 

	}

}
