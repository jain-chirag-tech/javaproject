package chirag;

public class Reverse_Array {

	public static void main(String[] args) {
		int arr[] = {12,20,36,45,2,98,18};
		reverseArray(arr);
	}

	public static void reverseArray(int []arr) {
		int low = 0;
		int high = arr.length-1;
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		for(int i=0;i<arr.length;i++) {			
			System.out.print(arr[i]+ " ");
		}
	}
}
