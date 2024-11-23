package com.github.agrahul89.algorithms.leetcode.strings;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
  public int lengthOfLastWord(String s) {

    if (s.trim().isBlank())
      return 0;

    int i = s.length() - 1;

    while (i >= 0 && s.charAt(i) == ' ') {
      i--;
    }

    int l = i; // if i not updated then l is s.length() - 1

    while (i >= 0 && s.charAt(i) != ' ') {
      i--;
    }
    return l - i;
  }
}
