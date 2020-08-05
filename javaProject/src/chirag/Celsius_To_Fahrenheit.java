package chirag;

import java.util.Scanner;

public class Celsius_To_Fahrenheit {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    CelsiusToFahrenheit obj=new CelsiusToFahrenheit();
		    
		    int C;
		    C=sc.nextInt();
		    
		    System.out.println((int)(obj.cToF(C)));
		}
			sc.close();
	}
}
class CelsiusToFahrenheit
{
    public double cToF(int C)
    {
        return (1.8*C)+32;
    }
}
