package prac;
import java.text.DecimalFormat;
public class P101 {

		public static void main(String[] args) {

		final DecimalFormat df2 = new DecimalFormat("#.##");
		String ClosingBalance = "30716.30";
		String AvailableBalance="30718.41";
		
		
		double CB = Double.parseDouble(ClosingBalance);
		
		double AB = Double.parseDouble(AvailableBalance);
		double diff = (CB-AB);
		System.out.println(df2.format(diff));
		
				
	}

}
