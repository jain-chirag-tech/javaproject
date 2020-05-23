package javaProject;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number = ");
		int n =sc.nextInt();
		boolean b = isPerfect(n);
		if(b) {
			System.out.println(n + "is PERFECT");
		}
		else{
			System.out.println(n + "is NOT PERFECT");			
		}
	}

		
	public static boolean isPerfect(int n) {
		int sum = 0;
		for(int i=1 ; i<=n/2 ; i++ ) {
			if(n%i==0) {
				
				sum+=i;
			}
			if (n==sum) {
				return true;
				}		
				
	}
		return false;

}
}
