package com.github.agrahul89.algorithms.leetcode.lists;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MergeTwoSortedListTest {

  @Test
  void testMergeTwoLists() {
    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
    ListNode list2 = new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))));
    ListNode mergedList = new MergeTwoSortedList().mergeTwoLists(list1, list2);

    ListNode temp = mergedList;

    for (int value : new int[] { 1, 2, 3, 3, 4, 4, 5, 6 }) {
      assertThat(temp.val).isEqualTo(value);
      temp = temp.next;
    }
  }

}
