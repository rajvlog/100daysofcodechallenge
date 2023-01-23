/* Given an array nums with n objects colored red, white, or blue, 
sort them in-place so that objects of the same color are adjacent,
 with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:

Input: nums = [2,0,1]
Output: [0,1,2] */
 
class Solution {
    public void sortColors(int[] nums) {
    if(nums==null||nums.length<2){
        return;
    }
 
    int[] countArray = new int[3];
    for(int i=0; i<nums.length; i++){
        countArray[nums[i]]++;
    }
 
    int j = 0;
    int k = 0;
    while(j<=2){
        if(countArray[j]!=0){
            nums[k++]=j;
            countArray[j] = countArray[j]-1;
        }else{
            j++;
        }
    }
    }
}
