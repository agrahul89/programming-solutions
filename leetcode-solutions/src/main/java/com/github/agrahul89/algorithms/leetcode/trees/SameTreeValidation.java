package com.github.agrahul89.algorithms.leetcode.trees;

/**
 * https://leetcode.com/problems/same-tree
 */
public class SameTreeValidation {
  public boolean isSameTree(TreeNode p, TreeNode q) {

    if (p == null || q == null)
      return p == q;

    return isSameTree(p.left, q.left) && p.val == q.val && isSameTree(p.right, q.right);

  }
}
