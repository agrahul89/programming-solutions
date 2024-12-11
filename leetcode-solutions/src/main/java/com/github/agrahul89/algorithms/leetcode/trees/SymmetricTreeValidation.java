package com.github.agrahul89.algorithms.leetcode.trees;

/**
 * https://leetcode.com/problems/symmetric-tree
 */
public class SymmetricTreeValidation {
  public boolean isSymmetric(TreeNode root) {
    return (root == null || isSymmetric(root.left, root.right));

  }

  private boolean isSymmetric(TreeNode left, TreeNode right) {
    if (left == null || right == null) {
      return left == right;
    }
    return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
  }
}
