package com.github.agrahul89.algorithms.leetcode.trees;

import java.util.Scanner;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
  }

  public static TreeNode createTree() {
    try (Scanner scan = new Scanner(System.in)) {

      System.out.print("Start a new tree, [Enter 0 to terminate]: ");
      int value = scan.nextInt();

      if (value == 0)
        return null;

      TreeNode root = new TreeNode(value);
      root.addChildren(scan, root);
      return root;
    }
  }

  public StringBuilder stringify(StringBuilder prefix, boolean isTail, StringBuilder sb) {
    if (right != null) {
      right.stringify(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
    }
    sb.append(prefix).append(isTail ? "└── " : "┌── ").append(String.valueOf(val)).append("\n");
    if (left != null) {
      left.stringify(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
    }
    return sb;
  }

  @Override
  public String toString() {
    System.out.println(System.lineSeparator());
    return this.stringify(new StringBuilder(), true, new StringBuilder()).toString();
  }

  private void addChildren(Scanner scan, TreeNode root) {
    System.out.println(root.toString()); // print tree structure

    System.out.print("add left child of " + this.val + ", [Enter 0 to skip]: ");
    int leftVal = scan.nextInt();

    if (leftVal != 0) {
      left = new TreeNode(leftVal);
      left.addChildren(scan, root);
    }

    System.out.print("add right child of " + this.val + ", [Enter 0 to skip]: ");
    int rightVal = scan.nextInt();

    if (rightVal != 0) {
      right = new TreeNode(rightVal);
      right.addChildren(scan, root);
    }
  }

}
