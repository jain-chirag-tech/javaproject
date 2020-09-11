package javaProject;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		sc.close();
		boolean isPrime = true;
		for(int i=2 ; i<=Math.sqrt(n) ; i++) {
			if (n % i == 0) {
				isPrime=false;
				break;	}
		}
				
		if(isPrime) {
			System.out.println(n + " is PRIME ");
		}
		else {
			System.out.println(n + " is NOT PRIME ");
		}
		
	}

}
