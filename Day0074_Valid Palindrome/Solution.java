/* A phrase is a palindrome if, 
after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome. */

public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null) return false;
        if(s.equals("")) return true;
        s = s.toLowerCase();
        int f = -1;
        int e = s.length();
        boolean is = true;
        while(f < e){
            while(!Character.isLetter(s.charAt(++f)) && !Character.isDigit(s.charAt(f)) && f < s.length() - 1);
            while(!Character.isLetter(s.charAt(--e)) && !Character.isDigit(s.charAt(e)) && e > 0);
            
            if(!Character.isLetter(s.charAt(e)) && !Character.isDigit(s.charAt(e))
                && !Character.isLetter(s.charAt(f)) && !Character.isDigit(s.charAt(f))) break;
            else if(s.charAt(f) != s.charAt(e)){
                is = false;
                break;
            }
            
            
        }
        return is;
        
    }
}