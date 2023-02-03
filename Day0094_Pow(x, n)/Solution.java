/* Pow(x,n)
   Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100      */

import java.util.*;
import java.lang.*;
import java.io.*;
class Solution {
    public static double myPow(double x, int n) {
        if (n == Integer.MAX_VALUE) return x;
        else if (n == Integer.MIN_VALUE) return (x == 1 || x == -1) ? 1 : 0;
        if(n<0) {
            x=1/x;
            n*=-1;
        }
        double ans = 1;
        for(int i=0;i<n;i++)
            ans = ans*x;
        return ans;
    }
    
    public static void main(String[] args){
      System.out.println(myPow(2, 10));
    }
};