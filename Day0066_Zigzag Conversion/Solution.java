/*The string "PAYPALISHIRING" is written in a zigzag 
pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR" */

class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.isEmpty() || numRows <= 0) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        int step = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += step) {
                result.append(s.charAt(j));
                if (i != 0 && i != numRows - 1 && (j + step - 2 * i) < s.length()) {
                    result.append(s.charAt(j + step - 2 * i));
                }
            }
        }
        return result.toString();
    }

        
    }
