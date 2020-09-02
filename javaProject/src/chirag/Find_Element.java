package chirag;

public class Find_Element {
public static void main(String[] args) {
		
		int arr[] = {24,18,12,30,11,7};
		int x = 24;
		int position = Search_Element(arr,x);
		if(position == -1) 
		{
			System.out.println("Element Not Found");
		}
		else
		{
			System.out.println("Element Found at Position = "+ (position+1));
		}
		
	}
	
	public static int Search_Element(int arr[],int x){
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x)
				return i;
		}
			return -1;		
	}	
}
