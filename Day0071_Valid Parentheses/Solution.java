/* Given a string s containing just the characters '(', ')', '{', '}', 
'[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true  */

class Solution {
    public boolean isValid(String s) {
        int length = s.length();
        char[] s1 = s.toCharArray();
        if(length==0)
            return true;
        Stack<Character> stack = new Stack<>();
        
    for(int i=0;i<length;i++){
        if(s1[i]=='(' || s1[i]=='[' || s1[i]=='{'){
            stack.push(s1[i]);
        }
        else if(!stack.empty() && s1[i]==')' && stack.peek()=='('){
            stack.pop();
        }
        else if(!stack.empty() && s1[i]==']' && stack.peek()=='['){
            stack.pop();
        }
        else if(!stack.empty() && s1[i]=='}' && stack.peek()=='{'){
            stack.pop();
        }
        else {
            return false;
        }
    }
        
        return stack.empty();
   }
}