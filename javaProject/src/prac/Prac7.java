package prac;

import java.util.Scanner;

public class Prac7 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextLine();
		String B = sc.nextLine();
		sc.close();
		
		System.out.println(A.length()+B.length());
		int i = A.compareTo(B);
		if(i>0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
			
		String A1 = A.substring(0,1).toUpperCase()+A.substring(1);
		String B1 = B.substring(0,1).toUpperCase()+B.substring(1);
		
		System.out.println(A1 + " " + B1);
		}
		
		
	}
}

