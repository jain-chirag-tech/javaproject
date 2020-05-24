package javaProject;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Base Value = ");
		int a =sc.nextInt();
		System.out.print("Enter Exponent Value = ");
		int b =sc.nextInt();
		
		int result = 1;
		
		for(int i=1; i<=b; i++) {
			result*=a;
		}
		System.out.println(a + " raise to power "+ b + " = "+ result);		
		

	}

}
