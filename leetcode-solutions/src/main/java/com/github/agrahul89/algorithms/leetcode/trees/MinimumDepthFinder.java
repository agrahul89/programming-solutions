package com.github.agrahul89.algorithms.leetcode.trees;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class MinimumDepthFinder {

  public int minDepthDFS(TreeNode node) {
    if (node == null)
      return 0;
    return 1 + Math.min(minDepthDFS(node.left), minDepthDFS(node.right));
  }

}
