/*Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.


Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]
Sample Output

true
true
false
true*/

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            int n=-1;
            while (input.length()!=n){
                n=input.length();
                input=input.replace("{}","");
                input=input.replace("()","");
                input=input.replace("[]","");    
            }
            if (input.length()==0)
                System.out.println("true");
            else
                System.out.println("false");
        }
        sc.close();
		}
		
	}




