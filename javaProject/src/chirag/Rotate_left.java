package chirag;

public class Rotate_left {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		int n = arr.length;
		
		System.out.println("Original Array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}		
		lRotateOne(arr,n);
	}
	
	public static void lRotateOne(int []arr, int n) {
		int temp = arr[0];
		for(int i=1; i<n; i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1] = temp;
		System.out.println("\n\nArray left Rotate by One ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}	
}
