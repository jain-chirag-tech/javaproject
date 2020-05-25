//Practicing array input and output...

package array;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter Number of Elements = ");
		int n = sc.nextInt();
		
//		int[] marks ;
//		marks = new int[n];
		
		int [] marks =new int [n];
		
		System.out.println("Input Marks");
		for(int i=0 ; i<n ; i++) {
			marks[i] = sc.nextInt();
		}
		System.out.println("Output Marks");
		for(int i=0 ; i<n ; i++) {	
			System.out.print(marks[i] + "  ");
		}
		
		
	}

}
