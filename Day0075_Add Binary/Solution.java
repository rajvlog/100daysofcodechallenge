/*Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101" */
 
class Solution {
    public String addBinary(String a, String b) {
    
        StringBuilder result = new StringBuilder();
        
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        
        int carry = 0;
        
        while(aLength >= 0 || bLength >= 0){
            
            int sum = carry;
            
            if(aLength >= 0) {
                sum += (a.charAt(aLength--) - '0');        
            }
            
            if(bLength >= 0) {
                sum += (b.charAt(bLength--) - '0');
            }
            
            result.insert(0, sum%2);
            
            carry = (sum / 2);
        }
        
        if (carry > 0) {
            result.insert(0, 1);
        }
        
         return result.toString();
    }
}