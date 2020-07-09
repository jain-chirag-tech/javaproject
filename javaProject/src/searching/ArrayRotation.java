package searching;

public class ArrayRotation {
	
	static int arrayRotation(int []a, int n) {
		
		int low = 0;
		int high = n-1;	
		
		while(low<=high) {
		if(a[low] <= a[high])
		{
			return low;
		}
		
		int mid = (low + high)/2;
		int prev = (mid - 1 + n)%n;
		int next = (mid + 1)%n;
				
		if(a[prev]>=a[mid] && a[next]>=a[mid])
		{
			return mid;
		}
		
		else if(a[mid]<=a[high])
		{
			high = mid-1;
		}
		else if(a[mid]>=a[low])
		{
			low = mid+1;
		}
	}
		return 0;
	}		
	
	public static void main(String [] args) {
		
		int a[] = {17,20,2,3,5,7,9,11,13,15};
		int n = a.length;
		int minIndex = arrayRotation(a, n);
		System.out.println("Array Rotated " + minIndex + " times");				
	}	
}
