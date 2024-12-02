package com.github.agrahul89.algorithms.leetcode.lists;

public class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("[ ");
    ListNode next = this;
    while (next != null) {
      builder.append(next.val);
      next = next.next;
      if (next != null)
        builder.append(", ");
    }
    return builder.append(" ]").toString();
  }
}
