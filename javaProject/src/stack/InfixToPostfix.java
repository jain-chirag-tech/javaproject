package stack;
import java.util.Stack;
public class InfixToPostfix {

	static int Prec(char c) {
		switch(c) {
		case '+':
		case '-':
			return 1;
		
		case '/':
		case '*':
			return 2;
					
		case '^':
			return 3;			
		}             // end of switch statement
		return -1;
	}                // end of prec function
	 
	
	static String infixToPostfix(String exp) {
		
		Stack<Character> stack = new Stack<>();
		String res = "";
		
		for(int i = 0; i<exp.length(); i++) {
			
			char c = exp.charAt(i);
			
			if(Character.isLetterOrDigit(c)) {
				res+=c;
			}
			else if(c=='(') {
				stack.push(c);
			}
			else if(c==')') {
				while(!stack.isEmpty()&&stack.peek()!='(') 
					res+=stack.pop();
					  
	                if (!stack.isEmpty() && stack.peek() != '(') 
	                    return "Invalid Expression";
	                else
	                	stack.pop();
				}
			else 
			{
				while(!stack.empty()&&Prec(c)<=Prec(stack.peek())){
					res+=stack.pop();
				}
			stack.push(c);
			}
		}				//for loop ends
		while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            res += stack.pop(); 
         } 
        return res;
	}    		//infix to post fix method end
	
	public static void main(String[] args) {
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println("after conversion : " + infixToPostfix(exp));
	}
}
