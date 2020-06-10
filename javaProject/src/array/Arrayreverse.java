package array;

import java.util.Scanner;

public class Arrayreverse {

	// reversing array using another array	
	
	public static void main(String[] args) {
		
		int[] arr= {10,45,35,25,48,16,89};
		reverseArray(arr,arr.length);		

	}
	
	static void reverseArray(int []a , int n) {
		
		int [] b = new int[n];
		int j = n;
		for(int k = 0; k<n; k++) {
			b[j-1]=a[k];
			j--;}
			
		for(int i=0; i<n; i++) {
		 System.out.print(b[i] + " ");
		}
		
		
	}

}
