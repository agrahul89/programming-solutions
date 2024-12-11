package com.github.agrahul89.algorithms.leetcode.trees;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class HeightBalancedBST {
  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums == null || nums.length == 0)
      return null;

    int mid = nums.length / 2;
    TreeNode node = new TreeNode(nums[mid]);

    if (nums.length == 1)
      return node;

    node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
    node.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
    return node;
  }

}
