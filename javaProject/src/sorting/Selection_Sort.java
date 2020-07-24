package sorting;

public class Selection_Sort {

	
static void SelectionSort(int []a , int n) {
	for(int i=0; i<n-1; i++) {
		for(int j=i+1; j<n; j++) {
			if(a[i]>a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
 			}
		}
	}
}

public static void main(String[] args) {
	int a[] = {64,25,12,22,11};
	SelectionSort(a,a.length);
	for(int i=0; i<a.length; i++) {
	System.out.print(a[i]+" ");
	}
}
}
