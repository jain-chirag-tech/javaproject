package array;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] a = {9,7,6,3,4};
		int n = a.length;
		int c=0;
		for(int i=0 ; i<n-1 ; i++) {
			
			boolean sorted = true;
			
			for(int j =0 ;j<n-1-i ; j++) {
				
				if(a[j+1] < a[j]) {
					int temp;
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
				sorted = false;
					c++;
				}				
			}
		   if(sorted) {
			   break;
		   }
		}
		System.out.println("Swapping done " + c + " times ");
		for(int i : a)
		System.out.print(i + "  ");
		
	}

}
