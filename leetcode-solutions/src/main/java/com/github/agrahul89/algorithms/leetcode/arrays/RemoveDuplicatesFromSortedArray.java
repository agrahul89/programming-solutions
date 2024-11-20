package com.github.agrahul89.algorithms.leetcode.arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array
 */
public class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {

    int uniqueCount = 0, lp = 0, rp = 1;

    while (rp < nums.length) {
      if (nums[lp] != nums[rp]) {
        nums[++lp] = nums[rp];
        uniqueCount++;
      } else
        rp++;
    }

    return uniqueCount + 1;
  }

  public int removeDuplicatesBestSolution(int[] nums) {
    int i = 0;

    for (final int num : nums)
      if (i < 1 || num > nums[i - 1])
        nums[i++] = num;

    return i;
  }

}
