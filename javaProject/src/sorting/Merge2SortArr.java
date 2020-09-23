package sorting;

public class Merge2SortArr {

	public static void main(String[] args) {
		
		int a[] = {10,15,20,40};
		int b[] = {5,6,6,10,15};
		mergeTwoSortedArray(a,b);
	}
	
	static void mergeTwoSortedArray(int []a,int []b) {
		int m = a.length;
		int n = b.length;
		int i=0, j=0;
		while(i<m && j<n) {
			if(a[i]<b[j]) 
			{
				System.out.print(a[i++] + " ");
			}
			else
			{
				System.out.print(b[j++] + " ");
			}
		}
		while(i<m) {System.out.print(a[i++] + " ");}
		while(j<n) {System.out.print(b[j++] + " ");}
		
	}

}
