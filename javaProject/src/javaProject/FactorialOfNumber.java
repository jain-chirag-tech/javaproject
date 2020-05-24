package javaProject;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number = ");
		int n = sc.nextInt();
		int result=1;
		result = factorial(n);
		System.out.println("Factorial of " + n +" = "+ result);		

	}
	public static int factorial(int n) {
		int sum = 1;
		for(int i=1 ; i<=n ; i++) {
			sum *= i;		
			
		}
		return sum;
		
		
	}

}
