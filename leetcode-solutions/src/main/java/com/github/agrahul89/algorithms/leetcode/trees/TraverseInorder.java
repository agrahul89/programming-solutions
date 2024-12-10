package com.github.agrahul89.algorithms.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class TraverseInorder {

  private List<Integer> output = new ArrayList<>();

  public List<Integer> inorderTraversal(TreeNode root) {

    if (root == null)
      return output;

    if (root.left != null)
      inorderTraversal(root.left);

    output.add(root.val);

    if (root.right != null)
      inorderTraversal(root.right);

    return output;
  }

}
