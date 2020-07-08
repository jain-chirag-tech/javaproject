package prac;

import java.util.Scanner;

public class Prac24 {

	static int binarySearch(int []a,int x) {
		
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] == x)
			{
				count++;				
			}			
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[] = {2,4,6,12,12,12,12,18,18,24,30};
		System.out.print("Enter Number to be Searched : ");
		int x = sc.nextInt();
		sc.close();
		int freq = binarySearch(a,x);
		System.out.println("Number Occured " + freq + " times");		
	}
	
}
