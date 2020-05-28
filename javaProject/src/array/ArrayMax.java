package array;

public class ArrayMax {

	public static void main(String[] args) {
		
		int []a = { 5 , 12 , 74 , 66 , 25 };
		int max = a[0];
		for(int i = 1; i<a.length ; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Maximum Number is " + max);

	}

}
