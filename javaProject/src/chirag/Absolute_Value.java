package chirag;

import java.util.Scanner;

public class Absolute_Value {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int T = sc.nextInt(); // number of testcases
	        while (T > 0) {
	            int I = sc.nextInt();
	            Absolute obj = new Absolute();
	            System.out.println(obj.absolute(I));

	            T--;
	        }
	        sc.close();
	    }
	}
	
	class Absolute {
	   
	    public int absolute(int I) {
	        return Math.abs(I);
	    }
}

