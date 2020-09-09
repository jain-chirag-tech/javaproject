package javaProject;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no = ");
		int n = sc.nextInt();
		sc.close();
		
		float sum = 0 ;
		for(float i=1 ; i<=n ; i++) {
			sum += 1/i;
		}
		System.out.println("Sum of Series = " + sum);
	}
}
