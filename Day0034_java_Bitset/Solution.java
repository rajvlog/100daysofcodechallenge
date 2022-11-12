import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
/* java Bitset
preoblem- you have Given 2 BitSets, B1 and B2, of size N 
where all bits in both BitSets are initialized to 0,
 perform a series of M operations. After each operation,
 print the number of set bits in the respective BitSets
 as two space-separated integers on a new line.*/

import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();

    BitSet b1 = new BitSet(n);
    BitSet b2 = new BitSet(n);

    for (int i = 0; i < m; i++) {
      String opcode = scan.next();
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();

      switch(opcode) {
        case "AND":
          if (num1 == 1 && num2 == 2) {
            b1.and(b2);
          } else if (num1 == 2 && num2 == 1) {
            b2.and(b1);
          } else if (num1 == 1 && num2 == 1) {
            b1.and(b1);
          } else if (num1 == 2 && num2 == 2) {
            b2.and(b2);
          }
          break;
        case "OR":
          if (num1 == 1 && num2 == 2) {
            b1.or(b2);
          } else if (num1 == 2 && num2 == 1) {
            b2.or(b1);
          } else if (num1 == 1 && num2 == 1) {
            b1.or(b1);
          } else if (num1 == 2 && num2 == 2) {
            b2.or(b2);
          }
          break;
        case "XOR":
          if (num1 == 1 && num2 == 2) {
            b1.xor(b2);
          } else if (num1 == 2 && num2 == 1) {
            b2.xor(b1);
          } else if (num1 == 1 && num2 == 1) {
            b1.xor(b1);
          } else if (num1 == 2 && num2 == 2) {
            b2.xor(b2);
          }
          break;
        case "FLIP":
          if (num1 == 1) {
            b1.flip(num2);
          } else if (num1 == 2) {
            b2.flip(num2);
          }
          break;
        case "SET":
          if (num1 == 1) {
            b1.set(num2);
          } else if (num1 == 2) {
            b2.set(num2);
          }
          break;
      }
      System.out.println(b1.cardinality() + " " + b2.cardinality());
    }
    }
}