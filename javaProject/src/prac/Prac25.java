package prac;

import java.util.Stack;

public class Prac25 {

	static Stack<Character> s = new Stack<>();
	
	static boolean isBalanced(String exp) {
		
		for(int i = 0; i<exp.length(); i++) {
			char x = exp.charAt(i);
			
			if(x=='(' || x=='{' || x=='[') {
				s.push(x);
				continue;
			} 
			
			if(s.isEmpty()) 
				return false;
			 
			switch (x) {
				case ')' :
					x = s.peek();
					s.pop();
					if(x=='{' || x=='[') 
						return false;
					break;
					
				case '}' :
					x=s.peek();
					s.pop();
					if(x=='(' || x=='[') 
						return false;
					break;
					
				case ']' :
					x=s.peek();
					s.pop();
					if(x=='(' || x=='{') 
						return false;
					break;	
					
				}				// switch case ends			
		}						//for loop ends
		return (s.isEmpty());
	}							//function ends
	
	public static void main(String[] args) {
		 
      //  String exp = "([{}])"; 							//Balanced 
	  //  String exp = "({}])";								//Not Balanced 
	  //  String exp = "[(])";								//Not Balanced 
		  String exp ="[()]{}{[()()]()}";					//Balanced
        if (isBalanced(exp)) 
            System.out.println("Balanced "); 
        else
            System.out.println("Not Balanced "); 
    } 
}
