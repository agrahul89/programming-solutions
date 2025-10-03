package com.github.agrahul89.algorithms.leetcode.trees;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TraverseInLevelOrder {

  public void traverse(TreeNode root) {
    Queue<TreeNode> queue = new LinkedBlockingQueue<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      System.out.print(node.val + ", ");

      if (node.left != null)
        queue.add(node.left);

      if (node.right != null)
        queue.add(node.right);
    }
  }

  public Map<Integer, List<Integer>> levels = new LinkedHashMap<>();

  public TraverseInLevelOrder traverse(TreeNode node, int level) {
    levels.putIfAbsent(level, new LinkedList<>());
    levels.get(level).add(node.val);

    if (node.left != null)
      traverse(node.left, level + 1);

    if (node.right != null)
      traverse(node.right, level + 1);

    return this;
  }

}
