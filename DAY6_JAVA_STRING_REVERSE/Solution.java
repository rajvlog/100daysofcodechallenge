/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev="";
        for(int i=A.length()-1;i>=0;i--)
        {
            rev = rev+A.charAt(i);
        }
        if(rev.equals(A))
         System.out.print("Yes");
         else
         System.out.print("No");   
    }
}

