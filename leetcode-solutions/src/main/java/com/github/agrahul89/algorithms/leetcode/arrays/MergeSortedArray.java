package com.github.agrahul89.algorithms.leetcode.arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array
 */
public class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {

    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;

    while (j >= 0) {
      nums1[k--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
    }

  }
}
