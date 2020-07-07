package searching;

import java.util.Scanner;

public class FirstOccur {

static int binarySearch(int []a,int n,int x) {
		
		int low = 0;
		int high = n-1;
		int result = -1;
		
		while(low <= high) {
			int mid = low + (high - low)/2;				//(low+high)/2;
			
			if(a[mid] == x) {
				result = mid;
				high = mid-1;
			   }
			else if(x < a[mid]){
				high = mid - 1;
			   } else {
				low = mid + 1;
			}
		}		
		return result;
	}

public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	int a[] = {2,4,6,12,12,12,12,18,24,30};
	int n = a.length;
	System.out.print("Enter Number to be Searched : ");
	int x = sc.nextInt();
	sc.close();
	int index = binarySearch(a,n,x);
	if(index != -1) {
	System.out.println("The Number " + x + " is Occured First at Index "+ index);
    }else {
    	System.out.println("Number is not Present ");
    }		
}		
	
}
