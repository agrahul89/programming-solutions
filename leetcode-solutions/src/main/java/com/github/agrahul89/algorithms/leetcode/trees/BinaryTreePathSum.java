package com.github.agrahul89.algorithms.leetcode.trees;

/**
 * https://leetcode.com/problems/path-sum/
 */
public class BinaryTreePathSum {

  public boolean anyPathEquals(TreeNode node, int sum) {
    if (node == null)
      return false;

    if (node.val == sum && node.left == null && node.right == null)
      return true;

    return anyPathEquals(node.left, sum - node.val) || anyPathEquals(node.right, sum - node.val);
  }

}
