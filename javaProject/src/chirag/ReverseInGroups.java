package chirag;

import java.util.ArrayList;

public class ReverseInGroups {
	public static void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
    }
    // Function to reverse array in group of k 
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
          int[] arr = new int[n];
        int idx = 0;
        for(int j : mv){
            arr[idx++] = j; 
        }
        for( int i = 0; i < n; i+=k){
            int right = Math.min(i+k-1, n-1);
            reverse(arr, i, right);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int a : arr){
            ans.add(a);
        }
        return ans;
        
    }
}
