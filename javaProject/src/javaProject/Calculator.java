package javaProject;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first Number = ");
		int a = sc.nextInt();
	
		System.out.print("Enter Second Number = ");
		int b = sc.nextInt();
		
		System.out.print("Enter Opertion = ");
		sc.nextLine();		
		char operation = sc.nextLine().charAt(0);
		
		float result = 0;	
		switch(operation) {
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = (float) a/b;
			break;
		default:
			System.out.println("Invalid Number");		
		}
		
		System.out.println("Result is = " + result);

	}

}
