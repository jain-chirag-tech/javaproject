/* 
Input: "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
*/

package leetcode;

import java.util.Stack;

public class RemoveParenthesis {
	public String removeOuterParentheses(String S) {
        Stack<Character> s = new Stack<>();
        String x = "";
        for (char i:S.toCharArray()){
            if(i == '(' && s.size() == 0)
                s.push(i);
            else if(i == '(' && s.size() > 0){
                s.push(i);
                x+=i;
            }
            else if(i == ')' && s.size() > 1){
                char c = i;
                while(c != '('){
                    c = s.pop();
                     x+=i;
                }
            }
             else if(i == ')' && s.size() == 1)
                 s.pop();
        }
        return x;
    }
}
