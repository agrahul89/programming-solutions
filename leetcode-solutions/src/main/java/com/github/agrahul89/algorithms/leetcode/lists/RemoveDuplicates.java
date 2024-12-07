package com.github.agrahul89.algorithms.leetcode.lists;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list
 */
public class RemoveDuplicates {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode curr = head;

    while (curr != null) {
      while (curr.next != null && curr.val == curr.next.val) {
        curr.next = curr.next.next;
      }
      curr = curr.next;
    }

    return head;
  }

  public ListNode deleteDuplicatesRecursively(ListNode head) {

    if (head == null)
      return null;

    head.next = deleteDuplicatesRecursively(head.next);

    if (head.next != null && head.val == head.next.val) {
      return head.next;
    }

    return head;

  }

  public static void main(String[] args) {
    RemoveDuplicates remove = new RemoveDuplicates();
    System.out.println(remove.deleteDuplicates(new ListNode(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 })));
    System.out.println(remove.deleteDuplicates(new ListNode(new int[] { 1, 1, 3, 5, 5, 7, 7, 8, 9 })));
    System.out.println(remove.deleteDuplicates(new ListNode(new int[] { 1, 3, 3, 3, 5, 7, 8, 9, 9 })));
    System.out.println(remove.deleteDuplicates(new ListNode(new int[] { 1, 1, 1, 3, 5, 7, 8, 8, 9 })));
    System.out.println(remove.deleteDuplicates(new ListNode(new int[] { 1, 3, 5, 5, 7, 8, 9, 9, 9 })));
  }

}
