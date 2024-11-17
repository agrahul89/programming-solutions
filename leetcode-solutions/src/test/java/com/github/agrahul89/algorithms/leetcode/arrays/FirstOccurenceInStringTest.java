package com.github.agrahul89.algorithms.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FirstOccurenceInStringTest {

  @ParameterizedTest
  @CsvSource(delimiterString = " -> ", textBlock = """
      a -> a -> 0
      cat -> cat spilled the milk -> 0
      twig -> thief has twig in his beard -> 10
      yes -> this sentence does not meet requested criteria -> -1
      """)
  void testFindIndexOfFirstOccurence(String needle, String haystack, int start) {
    assertThat(new FirstOccurenceInString().findIndexOfFirstOccurence(haystack, needle)).isEqualTo(start);
  }

}
