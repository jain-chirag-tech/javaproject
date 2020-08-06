package dataStructure;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> mobile = new ArrayList<>();
		ArrayList<String> houseNo = new ArrayList<>();

		mobile.add("Apple");
		mobile.add("Motorola");
		mobile.add("vivo");
		mobile.add("Oppo");
		mobile.add("Redmi");
		
		mobile.remove(2);
				
		System.out.println(mobile);
		
		houseNo.add("101");
		houseNo.add("103");
		houseNo.add("105");
		houseNo.add("107");
		houseNo.add("109");
		
		System.out.println(houseNo);
		houseNo.clear();
		System.out.println(houseNo);
		mobile.addAll(houseNo);
		System.out.println(mobile);
	}

}
