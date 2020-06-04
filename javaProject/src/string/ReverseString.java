package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "chirag is a good boy";
		System.out.println(ReverseString(str));
	}

		static String ReverseString(String s) {
			int i = s.length()-1;
			String ans = "";
			while(i>=0) {
				
				while(i>=0 && s.charAt(i)==' ')i--;
			
				int j = i;
				
				while(i>=0 && s.charAt(i)!=' ')i--;
				
				if(ans.isEmpty()) {
					ans = ans.concat(s.substring(i+1, j+1));
				} else {
					ans = ans.concat(" " + s.substring(i+1, j+1));
				}
				
			}
			
			return ans;
		}
}
