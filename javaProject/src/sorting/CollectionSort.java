package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String [] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(18);
		list.add(12);
		list.add(8);
		list.add(30);
		list.add(11);
//		
//		Collections.sort(list);
//		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	
		
//		List<String> list = new ArrayList<String>();
//		list.add("chirag");
//		list.add("Jain");
//		list.add("Chirag");
//		list.add("jain");
//		
//		Collections.sort(list);
//		System.out.println(list);	
	}
}
