package com.github.agrahul89.algorithms.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PlusOneTest {

  @ParameterizedTest
  @MethodSource("testData")
  void testPlusOne(int[] digits, int[] expected) {
    assertThat(new PlusOne().plusOne(digits)).containsExactly(expected);
  }

  @ParameterizedTest
  @MethodSource("testData")
  void testPlusOneBestSolution(int[] digits, int[] expected) {
    assertThat(new PlusOne().plusOneBestSolution(digits)).containsExactly(expected);
  }

  private static Stream<Arguments> testData() {
    return Stream.of(

        Arguments.of(new int[] { 0 }, new int[] { 1 }),

        Arguments.of(new int[] { 9 }, new int[] { 1, 0 }),

        Arguments.of(new int[] { 0, 9 }, new int[] { 1, 0 }),

        Arguments.of(new int[] { 9, 0 }, new int[] { 9, 1 }),

        Arguments.of(new int[] { 9, 9 }, new int[] { 1, 0, 0 }),

        Arguments.of(new int[] { 1, 2, 3 }, new int[] { 1, 2, 4 })

    );

  }

}
