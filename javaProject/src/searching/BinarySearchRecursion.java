package searching;

import java.util.Scanner;

public class BinarySearchRecursion {

	static int binarySearch(int []a, int low,int high, int x){
		
		if(low <= high) {
			int mid = low + (high - low)/2;
			
			if(a[mid] == x) {
				return mid;
			} 
			else if(x < a[mid]){
				return binarySearch(a,low,mid-1,x); 
			} else {
				return binarySearch(a,mid+1,high,x);
			}
		}		
		return -1;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[9];
		System.out.println("Enter Numbers in the Array : ");
		
		for(int i=0; i<9 ; i++) {
		a[i] =sc.nextInt();
	        }
		
		System.out.println("Enter the Number to be Searched : ");
		int x = sc.nextInt();
		sc.close();
		
		int index = binarySearch(a,0,a.length,x);
		
		if(index != -1) {
		System.out.print("Number Entered " + x + " is Present at index "+ index);
	      } else {
	    	  System.out.print("Number not Found");
	      }
	}	
}
