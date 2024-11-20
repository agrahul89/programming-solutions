package com.github.agrahul89.algorithms.leetcode.arrays;

/**
 * https://leetcode.com/problems/search-insert-position
 */
public class SearchInsertPosition {
  public int searchInsert(int[] nums, int target) {
    int left = 0, right = nums.length;

    while (left < right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return left;
  }

}
