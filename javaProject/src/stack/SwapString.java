package stack;

import java.util.Scanner;

public class SwapString {
	
	public static void Swap(char []a, int index1 ,int index2) {
		
		char temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
		//return a;
	}
	
	public static void reverse(char[] a) {
		int n = a.length;int i;
		for(i=0;i<n/2;i++) {
		Swap(a,i,n-i-1);
		}		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String : ");
		String str = sc.nextLine();
		char []a = str.toCharArray();
		reverse(a);
		System.out.printf("Reverse String : " + String.valueOf(a));
		sc.close();
	}	
}
