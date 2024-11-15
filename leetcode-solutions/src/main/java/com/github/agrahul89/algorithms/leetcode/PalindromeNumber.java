package com.github.agrahul89.algorithms.leetcode;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {

  /*
   * Reverse only half of original and compare
   */
  public boolean inPlaceSolutionBest(int x) {
    if (x < 0)
      return false;

    if (x < 10)
      return true;

    int reversed = 0;

    while (x > reversed) {
      reversed = (reversed * 10) + (x % 10);
      x /= 10;
    }

    return x == reversed || x == reversed / 10;
  }

  /*
   * Reverse original and compare
   */
  public boolean inPlaceSolutionBetter(int x) {
    if (x < 0)
      return false;

    if (x < 10)
      return true;

    int original = x;
    int reversed = 0;

    while (x > 0) {
      reversed = (reversed * 10) + (x % 10);
      x /= 10;
    }

    return original == reversed;
  }

  /*
   * Reverse original and compare, with Math functions
   */
  public boolean inPlaceSolution(int x) {
    if (x < 0)
      return false;

    if (x < 10)
      return true;

    int dividend = x;
    int divisor = (int) Math.pow(10, Math.floor(Math.log10(dividend)));

    while (divisor > 0) {
      int quotient = Math.floorDiv(dividend, divisor);
      int remainder = Math.floorMod(dividend, 10);

      if (quotient != remainder)
        return false;

      dividend = (dividend - (quotient * divisor)) / 10;
      divisor = divisor / 100;
    }

    return true;
  }

  /*
   * Compare 2 ends as char array using 2 pointers
   */
  public boolean asStringSolution(int x) {
    if (x < 0)
      return false;

    if (x < 10)
      return true;

    char[] digits = Integer.toString(x).toCharArray();

    int length = digits.length;
    int limit = (length % 2 == 0) ? ((length / 2) - 1) : (length / 2);

    for (int i = 0, j = length - 1; i <= length / 2 && j >= limit; i++, j--) {
      if (digits[i] != digits[j]) {
        return false;
      }
    }

    return true;
  }

}
