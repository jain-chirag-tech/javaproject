//Java Substring

package prac;

import java.util.Scanner;

public class Prac8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String s = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		
		System.out.println(s.substring(start, end));
   
//		int start = sc.nextInt();
//		int end = sc.nextInt();
//		String s = sc.next();
//		System.out.println(start);
//		System.out.println(end);
//		System.out.println(s);
	}

}
