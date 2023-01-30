/* Customer Sort String
You are given two strings order and s.
 All the characters of order are unique and were sorted in some custom order previously.

Permute the characters of s so that they match the order that order was sorted.
 More specifically, if a character x occurs before a character y in order,
 then x should occur before y in the permuted string.

Return any permutation of s that satisfies this property.

 

Example 1:

Input: order = "cba", s = "abcd"
Output: "cbad"
Explanation: 
"a", "b", "c" appear in order,
 so the order of "a", "b", "c" should be "c", "b", and "a". 
Since "d" does not appear in order, 
it can be at any position in the returned string.
 "dcba", "cdba", "cbda" are also valid outputs. */

class Solution {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder ans = new StringBuilder();
        for(char c:order.toCharArray()){
            while(freq[c-'a']-- > 0){
                ans.append(c);
            }
        }
        for(char c='a';c<='z';c++){
            while(freq[c-'a']-- > 0){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}