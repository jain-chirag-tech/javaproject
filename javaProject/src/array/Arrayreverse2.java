package array;

public class Arrayreverse2 {

	public static void main(String[] args) {
		
		int [] arr = {14,21,29,30,24,11,3,18};
		reverseArray(arr,arr.length);
	}
	
	static void reverseArray(int [] a, int n) {
		int i,temp; 
		for(i=0; i<n/2; i++) {
			temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
		}
		
		for(int k=0; k<n; k++) {
		System.out.print(a[k] + " ");
		}
	}

}
