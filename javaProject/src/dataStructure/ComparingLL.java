package dataStructure;
import java.util.LinkedList;
public class ComparingLL {
	
	public static void main(String[] args) {
		 
		LinkedList<Integer>ll1 = new LinkedList<Integer>();
		ll1.add(18);
     	ll1.add(12);
	    ll1.add(24);
	    ll1.add(11);
	    
	    LinkedList<Integer>ll2 = new LinkedList<Integer>();
		ll2.add(18);
     	ll2.add(12);
	    ll2.add(24);
	    ll2.add(11);
	    
	    boolean abc = ll1.equals(ll2);
	    System.out.println(abc);
	}
}
