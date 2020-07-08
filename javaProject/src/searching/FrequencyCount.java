package searching;

import java.util.Scanner;

public class FrequencyCount {

	static int BinarySearch(int []a, int n, int x, boolean searchFirst) {
		
		int low = 0;
		int high = n-1;
		int result = -1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			
			if(a[mid] == x) 
			{
				result = mid;
				if(searchFirst)
				{
					high = mid-1;
				}
				else
				{
					low = mid+1; 
				}
			}
			
			else if(x<a[mid]) 
			{
				high = mid-1;
			}
			else
				low = mid+1;
			
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
	int FirstOccur = BinarySearch(a,n,x,true);
	if(FirstOccur==-1)
	{
		System.out.println("Number Occured 0 times " );
	}
	else
	{
		int LastOccur = BinarySearch(a,n,x,false);
		System.out.println("Number Occured " + (LastOccur-FirstOccur+1) + " times ");
	}
  }

}