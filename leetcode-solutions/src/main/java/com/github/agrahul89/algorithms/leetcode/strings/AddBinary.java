package com.github.agrahul89.algorithms.leetcode.strings;

/**
 * https://leetcode.com/problems/add-binary
 */
public class AddBinary {
  public String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();

    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry == 1) {
      if (i >= 0) {
        carry += a.charAt(i--) - '0';
        // carry += a.charAt(i--) % 2; // this is slow
      }
      if (j >= 0) {
        carry += b.charAt(j--) - '0';
        // carry += b.charAt(j--) % 2; // this is slow
      }
      result.append(carry % 2);
      carry /= 2;
    }

    return result.reverse().toString();
  }

}
