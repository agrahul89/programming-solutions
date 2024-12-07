package com.github.agrahul89.algorithms.leetcode.lists;

import java.util.regex.Pattern;

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

  ListNode(int[] values) {
    if (values != null && values.length > 0) {
      ListNode start = new ListNode();
      ListNode head = start;
      for (int i = 0; i < values.length; i++) {
        head.val = values[i];
        if (i < values.length - 1)
          head.next = new ListNode();
        head = head.next;
      }
      this.val = start.val;
      this.next = start.next;
    }
  }

  ListNode(String items, String splitChar) {
    this(Pattern.compile(splitChar).splitAsStream(items).mapToInt(Integer::parseInt).toArray());
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    ListNode next = this;
    while (next != null) {
      builder.append(next.val);
      next = next.next;
      if (next != null)
        builder.append(",");
    }
    return builder.toString();
  }
}
