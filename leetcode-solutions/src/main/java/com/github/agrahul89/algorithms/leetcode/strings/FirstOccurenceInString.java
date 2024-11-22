package com.github.agrahul89.algorithms.leetcode.strings;

/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
 */
public class FirstOccurenceInString {
  public int findIndexOfFirstOccurence(String haystack, String needle) {
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      if (needle.equals(haystack.substring(i, i + needle.length()))) {
        return i;
      }
    }
    return -1;
  }
}
