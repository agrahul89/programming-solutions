package com.github.agrahul89.algorithms.leetcode.lists;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RemoveDuplicatesTest {

  private RemoveDuplicates remove = new RemoveDuplicates();

  @ParameterizedTest
  @CsvSource(delimiterString = " -> ", textBlock = """
      1,2,3,4,5,6,7,8,9 -> 1,2,3,4,5,6,7,8,9
      1,1,3,5,5,7,7,8,9 -> 1,3,5,7,8,9
      1,3,3,3,5,7,8,9,9 -> 1,3,5,7,8,9
      1,1,1,3,5,7,8,8,9 -> 1,3,5,7,8,9
      1,3,5,5,7,8,9,9,9 -> 1,3,5,7,8,9
      """)
  void testDeleteDuplicates(String test, String expected) {
    assertThat(remove.deleteDuplicates(new ListNode(test, ","))).hasToString(expected);
  }

  @ParameterizedTest
  @CsvSource(delimiterString = " -> ", textBlock = """
      1,2,3,4,5,6,7,8,9 -> 1,2,3,4,5,6,7,8,9
      1,1,3,5,5,7,7,8,9 -> 1,3,5,7,8,9
      1,3,3,3,5,7,8,9,9 -> 1,3,5,7,8,9
      1,1,1,3,5,7,8,8,9 -> 1,3,5,7,8,9
      1,3,5,5,7,8,9,9,9 -> 1,3,5,7,8,9
      """)
  void testDeleteDuplicatesRecursively(String test, String expected) {
    assertThat(remove.deleteDuplicatesRecursively(new ListNode(test, ","))).hasToString(expected);
  }

}
