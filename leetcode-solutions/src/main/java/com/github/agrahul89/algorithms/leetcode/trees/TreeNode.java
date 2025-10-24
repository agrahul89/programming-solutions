package com.github.agrahul89.algorithms.leetcode.trees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
  }

  public List<Integer> bottomView() {
    TreeMap<Integer, Integer> elements = new TreeMap<>(Comparator.naturalOrder());
    elements.put(0, this.val);
    bottomView(left, -1, elements);
    bottomView(right, 1, elements);
    return elements.sequencedValues().stream().toList();
  }

  private void bottomView(TreeNode node, int level, TreeMap<Integer, Integer> elements) {
    if (node == null)
      return;

    elements.put(level, node.val);

    bottomView(node.left, level - 1, elements);
    bottomView(node.right, level + 1, elements);
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

  public List<Integer> leftView() {
    List<Integer> elements = new ArrayList<>();
    leftView(this, 0, elements);
    return elements;
  }

  private void leftView(TreeNode node, int level, List<Integer> elements) {
    if (node == null)
      return;
    try {
      elements.set(level, node.val);
    } catch (IndexOutOfBoundsException ex) {
      elements.add(node.val);
    }
    leftView(node.left, level + 1, elements);
    leftView(node.right, level + 1, elements);
  }

  public List<Integer> rightView() {
    List<Integer> elements = new ArrayList<>();
    rightView(this, 0, elements);
    return elements;
  }

  private void rightView(TreeNode node, int level, List<Integer> elements) {
    if (node == null)
      return;
    try {
      elements.set(level, node.val);
    } catch (IndexOutOfBoundsException ex) {
      elements.add(node.val);
    }
    leftView(node.left, level + 1, elements);
    leftView(node.right, level + 1, elements);
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

  public List<Integer> topView() {
    TreeMap<Integer, Integer> elements = new TreeMap<>(Comparator.naturalOrder());
    elements.put(0, this.val);
    topView(left, -1, elements);
    topView(right, 1, elements);
    return elements.sequencedValues().stream().toList();
  }

  private void topView(TreeNode node, int level, TreeMap<Integer, Integer> elements) {
    if (node == null)
      return;

    elements.putIfAbsent(level, node.val);

    topView(node.left, level - 1, elements);
    topView(node.right, level + 1, elements);
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
