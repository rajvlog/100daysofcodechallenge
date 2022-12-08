/*Balanced Brackets */
import java.io.*; 
import java.util.*;
import java.text.*; 
import java.math.*;
import java.util.regex.*;


public class Solution {
public static void main(String[] args) 
{
    Scanner in = new Scanner(System.in); int n = in.nextInt();

for (int arr_i = 0; arr_i < n; arr_i++) 
{ Stack st = new Stack();
String ipSeq = in.next(); boolean match = true;
for (int ind = 0; ind < ipSeq.length(); ind++) { char ch = ipSeq.charAt(ind);
if (ch == '(' || ch == '{' || ch == '[') { st.push(ch);
} else if (st.isEmpty()) { match = false; break;
} else if (ch == ')') {
if ('(' != (char) st.pop()) { match = false;
break;
}
} else if (ch == '}') {
if ('{' != (char) st.pop()) { match = false;
break;
 
}
} else if (ch == ']') {
if ('[' != (char) st.pop()) { match = false;
break;
}
}
}
if (match) {
if (!st.isEmpty()) { System.out.println("NO");
} else {
System.out.println("YES");
}
} else {
System.out.println("NO");
}
}
}
}

