/* Number of atom
Given a string formula representing a chemical formula, return the count of each atom.

The atomic element always starts with an uppercase character, 
then zero or more lowercase letters, representing the name.

One or more digits representing that element's count may follow if the count is greater than 1. If the count is 1, no digits will follow.

For example, "H2O" and "H2O2" are possible, but "H1O2" is impossible.
Two formulas are concatenated together to produce another formula.

For example, "H2O2He3Mg4" is also a formula.
A formula placed in parentheses, and a count (optionally added) is also a formula.

For example, "(H2O2)" and "(H2O2)3" are formulas.
Return the count of all elements as a string in the following form:
 the first name (in sorted order), followed by its count (if that count is more than 1), 
followed by the second name (in sorted order), followed by its count (if that count is more than 1), and so on.

The test cases are generated so that all the values in the output fit in a 32-bit integer.

 

Example 1:

Input: formula = "H2O"
Output: "H2O"
Explanation: The count of elements are {'H': 2, 'O': 1}.
Example 2:

Input: formula = "Mg(OH)2"
Output: "H2MgO2"
Explanation: The count of elements are {'H': 2, 'Mg': 1, 'O': 2}. */

class Solution {
  public String countOfAtoms(String s) {
    StringBuilder sb = new StringBuilder();
    Map<String, Integer> count = parse(s);

    for (final String elem : count.keySet())
      sb.append(elem + (count.get(elem) == 1 ? "" : String.valueOf(count.get(elem))));

    return sb.toString();
  }

  private int i = 0;

  private Map<String, Integer> parse(String s) {
    Map<String, Integer> count = new TreeMap<>();

    while (i < s.length())
      if (s.charAt(i) == '(') {
        ++i; // Skip '('
        for (Map.Entry<String, Integer> entry : parse(s).entrySet()) {
          final String elem = entry.getKey();
          final int freq = entry.getValue();
          count.put(elem, count.getOrDefault(elem, 0) + freq);
        }
      } else if (s.charAt(i) == ')') {
        ++i; // Skip ')'
        final int num = getNum(s);
        for (final String elem : count.keySet()) {
          final int freq = count.get(elem);
          count.put(elem, freq * num);
        }
        return count; // Returns back to previous scope
      } else {
        final String elem = getElem(s);
        final int num = getNum(s);
        count.put(elem, count.getOrDefault(elem, 0) + num);
      }

    return count;
  }

  private String getElem(final String s) {
    final int elemStart = i++; // s[elemStart] is uppercased
    while (i < s.length() && Character.isLowerCase(s.charAt(i)))
      ++i;
    return s.substring(elemStart, i);
  }

  private int getNum(final String s) {
    final int numStart = i;
    while (i < s.length() && Character.isDigit(s.charAt(i)))
      ++i;
    final String numString = s.substring(numStart, i);
    return numString.isEmpty() ? 1 : Integer.parseInt(numString);
  }
}
