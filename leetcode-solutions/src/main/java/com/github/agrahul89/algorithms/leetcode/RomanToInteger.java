package com.github.agrahul89.algorithms.leetcode;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
  public int romanToInt(String s) {

    if (s == null || s.isEmpty())
      return 0;

    int[] values = new int[Byte.MAX_VALUE];
    values['I'] = 1;
    values['V'] = 5;
    values['X'] = 10;
    values['L'] = 50;
    values['C'] = 100;
    values['D'] = 500;
    values['M'] = 1000;

    String text = s.trim();
    if (text.length() == 1) {
      return values[text.charAt(0)];
    }

    int total = 0;
    int previous = 1;

    for (int i = text.length() - 1; i >= 0; i--) {
      int current = values[text.charAt(i)];
      total = (current < previous) ? (total - current) : (total + current);
      previous = current;
    }

    return total;
  }
}
