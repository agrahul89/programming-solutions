package com.github.agrahul89.algorithms.leetcode.arrays;

import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {

  public int[] plusOne(int[] digits) {

    if (IntStream.of(digits).allMatch(digit -> 9 == digit)) {
      int[] out = new int[digits.length + 1];
      out[0] = 1;
      return out;
    }

    int i = digits.length - 1;

    while (i >= 0) {
      if (digits[i] == 9) {
        digits[i--] = 0;
      } else {
        digits[i] = digits[i] + 1;
        break;
      }
    }
    return digits;
  }

  public int[] plusOneBestSolution(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        ++digits[i];
        return digits;
      }
      digits[i] = 0;
    }

    int[] out = new int[digits.length + 1];
    out[0] = 1;
    return out;
  }

}
