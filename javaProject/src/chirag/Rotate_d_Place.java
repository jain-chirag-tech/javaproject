package chirag;

public class Rotate_d_Place {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		int n = arr.length;
		int d = 2;
		
		System.out.println("Original Array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}		
		lRotate_d(arr,n,d);
	}
	
	public static void lRotate_d(int []arr, int n, int d) {
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
		
		System.out.println("\n\nArray left Rotate by d Place ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void reverse(int []arr,int low, int high) {
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
}
