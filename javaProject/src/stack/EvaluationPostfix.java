package stack;
import java.util.Stack;
public class EvaluationPostfix {

	static int evalPostfix(String exp) {
  Stack<Integer> s = new Stack<>();

  for(int i =0; i<exp.length(); i++) {
	  
	  char c = exp.charAt(i);
	  
	  if(c==' '||c==',') continue;
	  
	  else if(Character.isDigit(c)) {
		  int n = 0;
		  
		  while(Character.isDigit(c)) {
			  n=n*10 + (int)(c-'0');
			  i++;
			  c=exp.charAt(i);
		  }
		   i--;
		   s.push(n);
	  }								//else if block completed
	  
	  else {
		  int val2 = s.pop();
	  	  int val1 = s.pop();	
	  	  
		  switch(c) {
		      case '/':
		    	s.push(val1/val2);
		    	break;
		    	
		      case '*':
		    	  s.push(val1*val2);
		    	  break;
		    	  
		      case '+':
		    	  s.push(val1+val2);
		    	  break;
		    	
		      case '-':
		    	  s.push(val1-val2);
		    	  break;
		    	  
		   }		  
	    }					//else block completed   
     }						//for loop completed

  		return s.pop();	
	}

   public static void main(String[] args) {
	   	
	   String exp = "100 200 + 2 / 5 * 7 +";
	   System.out.println(evalPostfix(exp)); 
   }
}  





