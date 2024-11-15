package com.github.agrahul89.algorithms.leetcode.arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {

    if (strs == null || strs.length == 0)
      return "";

    // Collections.sort(Arrays.asList(strs), (o1, o2) -> o1.length() - o2.length());

    for (int i = strs[0].length(); i >= 0; i--) {
      String match = strs[0].substring(0, i);
      if (Arrays.stream(strs).allMatch(str -> str.startsWith(match))) {
        return match;
      }
    }

    return "";
  }

  /**
   * Unable to wrap my head around it as to how it works, but it has best time and
   * space complexity
   */
  public String longestCommonPrefixSolutionBest(String[] strs) {

    if (strs == null || strs.length == 0)
      return "";

    String longestCommonPrefix = strs[0];
    for (int i = 0; i < strs.length; i++) {
      while (!strs[i].startsWith(longestCommonPrefix)) {
        longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length() - 1);
        if (longestCommonPrefix.isEmpty())
          return "";
      }
    }

    return longestCommonPrefix;
  }

}
