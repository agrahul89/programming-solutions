package com.github.agrahul89.algorithms.leetcode.trees;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBST {

  // O(nlogn)
  public boolean isBalanced(TreeNode root) {
    if (root == null)
      return true;

    return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
  }

  private int maxDepth(TreeNode root) {
    if (root == null)
      return 0;

    return 1 + Math.abs(maxDepth(root.left) - maxDepth(root.right));
  }

  private boolean isBalanced = true;

  public boolean isBalancedBetter(TreeNode root) {
    maxDepthBetter(root);
    return isBalanced;
  }

  private int maxDepthBetter(TreeNode root) {
    if (root == null || !isBalanced) {
      return 0;
    }

    int left = maxDepthBetter(root.left);
    int right = maxDepthBetter(root.right);

    if (Math.abs(left - right) > 1)
      isBalanced = false;

    return Math.max(left, right);
  }

  public boolean isBalancedHeuristic(TreeNode root) {
    return maxDepthHeuristic(root) != -1;
  }

  private int maxDepthHeuristic(TreeNode root) {
    if (root == null)
      return 0;

    final int left = maxDepthHeuristic(root.left);
    if (left == -1)
      return -1;

    final int right = maxDepthHeuristic(root.right);
    if (right == -1)
      return -1;

    if (Math.abs(left - right) > 1)
      return -1;

    return 1 + Math.max(left, right);
  }

}
