package chirag;

public class Leader_Element {

	public static void main(String[] args) {
		int []arr = {4,6,10,7,5,9,2,1};
		int n = arr.length;
		System.out.println("Elements are ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		leader_element(arr,n);
	}

	public static void leader_element(int arr[],int n) {
		int curr_leader = arr[n-1];
		System.out.print("\n\n" + curr_leader +" ");
		
		for(int i=n-2; i>=0; i--) {
			if(arr[i] > curr_leader) {
				System.out.print(arr[i] + " ");
				curr_leader = Math.max(arr[i], curr_leader);
			}
		}
	}
}
