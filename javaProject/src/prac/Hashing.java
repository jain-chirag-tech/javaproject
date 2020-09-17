package prac;

import java.util.HashSet;

public class Hashing {
	
	public static void main(String[] args) {
	
		HashSet<Integer> hs = new HashSet<>();
	    hs.add(18);
     	hs.add(24);
     	hs.add(30);
     	hs.add(12);
     	hs.add(25);
     	hs.add(3);
     	hs.add(7);
        System.out.println(hs);
        hs.remove(25);
        System.out.println(hs);
//        hs.clear();
//        System.out.println(hs);
        
        HashSet<Integer> str = new HashSet<>();
        str.add(1016);
        str.add(2011);
        System.out.println(str);
        
        hs.addAll(str);
        System.out.println(hs);
        System.out.println(str);
        
        hs.retainAll(str);
        System.out.println(str);
	}	
}	


