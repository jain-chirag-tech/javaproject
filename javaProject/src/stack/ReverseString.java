package stack;
import java.util.Stack;
public class ReverseString {
	
	public static void reverse(StringBuffer s) 
    { 
		Stack<Character> obj = new Stack<Character>();
	 int n = s.length();         	
    
	 int i; 
     for (i = 0; i < n; i++) 
     obj.push(s.charAt(i)); 
     for (i = 0; i < n; i++) 
     {  
         char ch = (char) obj.pop(); 
         s.setCharAt(i,ch); 
     } 
    }


	public static void main(String[] args) {
		
		 StringBuffer s= new StringBuffer("GeeksQuiz");	 
		 
	        reverse(s); 
	          
	        System.out.println("Reversed string is " + s);
	}

}
