/* Partition Labels
You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.

Note that the partition is done so that after concatenating all the parts in order, 
the resultant string should be s.

Return a list of integers representing the size of these parts.

 

Example 1:

Input: s = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts. */

class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] index = new int[26];
        for (int i = 0; i < s.length(); ++i)
            index[s.charAt(i) - 'a'] = i;
        
        List<Integer> res= new ArrayList();
        int pivot=0;
        int last_index=0;
        for(int curr=0; curr <s.length(); curr++) {
            last_index = Math.max(last_index, index[s.charAt(curr) - 'a']);
            if(curr == last_index) {
                res.add(last_index-pivot+1);
                pivot=curr+1;
            }
        }
        return res;
    }
}