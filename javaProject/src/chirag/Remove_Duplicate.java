package chirag;

public class Remove_Duplicate {

	public static void main(String[] args) {
		
		int arr[] = {10,20,20,30,30,30,30};
		int n = arr.length;
		
		System.out.println("Original Array");
		for(int i=0; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		remove_duplicate(arr,n);
	}

	public static void remove_duplicate(int []arr,int n) {
		int []a = new int [n];
		int temp = 0;
		a[temp++] = arr[0];
		
		for(int i=1; i<n; i++) {
			if(arr[i-1] != arr[i]) {
				a[temp++] = arr[i];
			}
		}
		
		System.out.println("\n\nArray after Removing Duplicate");
		for(int i=0; i<temp ; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
