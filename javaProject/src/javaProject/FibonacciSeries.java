package javaProject;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number = ");
		
		int n = sc.nextInt();
		
		int a= 0;
		int	b=1;
		
		System.out.print(a + " ");
		System.out.print(b + " ");	
		
		int temp ;
		for(int i=0 ; i<n-2 ; i++) {
			temp = a + b;
			System.out.print(temp +" " );
			a=b;
			b=temp;
		
		}
		

	}

}
