package com.github.agrahul89.algorithms.leetcode.arrays;

public class RemoveValueInPlace {
  public int removeElement(int[] nums, int val) {

    if (val > 50)
      return nums.length;

    int filterCount = 0;
    int lp = 0, rp = nums.length - 1;

    while (lp <= rp) {

      if (nums[lp] == val) {
        nums[lp] = nums[rp];
        nums[rp--] = val;
        filterCount++;
      } else
        lp++;
    }

    return nums.length - filterCount;
  }
}
