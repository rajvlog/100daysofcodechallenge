/* Tapping Rain Water
Given n non-negative integers representing an elevation map
 where the width of each bar is 1, compute how much water it can trap after raining.
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped. */
 
class Solution 
{
    public int trap(int[] height)
    {
    if(height==null)
        return 0;
    int ans=0;
    for(int i=1;i<height.length-1;i++)
    {
        int l=Integer.MIN_VALUE;
        int r=Integer.MIN_VALUE;
        for(int j=0;j<i+1;j++)
            l=Math.max(l,height[j]);
        for(int j=i;j<height.length;j++)
            r=Math.max(r,height[j]);
        ans=ans+Math.min(l,r)-height[i];
    }
    return ans;
    }
}