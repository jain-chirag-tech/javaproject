package chirag;

public class Delete_Element {

   public static void main(String[] args) {
	
	int arr[] = {30,18,45,11,36,23};
	int x = 30;
	int n = arr.length;
	
	System.out.println("Array before deletion"); 
    for (int i=0; i<n; i++) 
      System.out.print(arr[i] + " "); 
    
    n = deleteEle(arr,n,x);
    
    System.out.println("\n\nArray after deletion"); 
    for (int i=0; i<n; i++) 
      System.out.print(arr[i]+" "); 
	}

 static int deleteEle(int[] arr, int n, int x) {
	 int i;
	for(i=0; i<n; i++) {
		if(arr[i]==x)
		{
			break;
		}	
		if(i==n) 
		{
			return n;
		}
	}
	for(int j=i; j<n-1; j++) {
		arr[j] = arr[j+1];
	}
	return (n-1);
 }

}
