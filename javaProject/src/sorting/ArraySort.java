package sorting;
import java.util.*;

public class ArraySort {
	
	public static void main(String [] args) {
	int arr[] = {5,10,20,50};
	Arrays.sort(arr);
	//System.out.println(Arrays.toString(arr));	
	for(int i : arr) {
		System.out.print(i + " ");
	}
		
	}
}
