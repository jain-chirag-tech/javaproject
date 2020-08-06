package javaProject;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number = ");
		
		int n = sc.nextInt();
		sc.close();
		int temp = n;
		int sum = 0;
		while(n>0) {
			int r = n%10;
			sum += (r*r*r);
			n/=10;		
		}
	
		if(temp==sum) 
		{
			System.out.println(temp +" is Amstrong Number ");
		}
		else
		{
			System.out.println(temp +" is Not Amstrong Number ");			
		}	
	}
}	
	
		
	


