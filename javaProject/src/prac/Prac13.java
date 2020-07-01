package prac;
import java.util.LinkedList;
public class Prac13 {

	public static void main(String[] args) {
		
		 LinkedList<Integer> ll 
         = new LinkedList<Integer>(); 

     for (int i = 1; i <= 10; i++) 
         ll.add(i); 

     System.out.println(ll); 

     ll.remove(0);
     ll.remove(5);
  
     System.out.println(ll); 

     for (int i = 0; i < ll.size(); i++) 
         System.out.print(ll.get(i) + " "); 
		
	}

}
