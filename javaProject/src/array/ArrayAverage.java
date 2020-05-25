package array;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Element = ");
		int n = sc.nextInt();
		
		int [] marks =new int [n];
				
		System.out.println("Enter the Marks of Student = ");
		for(int i=0 ; i<n ; i++) {
			marks[i] = sc.nextInt();
 		}
		
		double average = 0;
		for(int i=0 ; i<n ; i++) {
			average += marks[i];
		}
		average /= n;
		System.out.println("Average Marks of Student = " + average);
	}

}
