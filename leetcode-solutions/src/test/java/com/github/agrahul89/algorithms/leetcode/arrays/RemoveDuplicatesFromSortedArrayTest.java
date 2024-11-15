package com.github.agrahul89.algorithms.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveDuplicatesFromSortedArrayTest {

  @ParameterizedTest
  @MethodSource("testData")
  void testRemoveDuplicates(int[] nums, int expectedCount, int[] expectedSequence) {
    assertThat(new RemoveDuplicatesFromSortedArray().removeDuplicates(nums)).isEqualTo(expectedCount);
    for (int i = 0; i < expectedCount; i++) {
      assertThat(nums[i]).isEqualTo(expectedSequence[i]);
    }
  }

  @ParameterizedTest
  @MethodSource("testData")
  void testRemoveDuplicatesBestSolution(int[] nums, int expectedCount, int[] expectedSequence) {
    assertThat(new RemoveDuplicatesFromSortedArray().removeDuplicatesBestSolution(nums)).isEqualTo(expectedCount);
    for (int i = 0; i < expectedCount; i++) {
      assertThat(nums[i]).isEqualTo(expectedSequence[i]);
    }
  }

  private static Stream<Arguments> testData() {
    return Stream.of(

        Arguments.of(new int[] { 1 }, 1, new int[] { 1 }),

        Arguments.of(new int[] { 1, 1 }, 1, new int[] { 1 }),

        Arguments.of(new int[] { 1, 2 }, 2, new int[] { 1, 2 }),

        Arguments.of(new int[] { 1, 1, 2 }, 2, new int[] { 1, 2 }),

        Arguments.of(new int[] { 1, 2, 2 }, 2, new int[] { 1, 2 }),

        Arguments.of(new int[] { 1, 2, 3 }, 3, new int[] { 1, 2, 3 }),

        Arguments.of(new int[] { 1, 2, 2, 3, 4, 4, 5 }, 5, new int[] { 1, 2, 3, 4, 5 }),

        Arguments.of(new int[] { 1, 2, 3, 4, 5, 5, 6, 7 }, 7, new int[] { 1, 2, 3, 4, 5, 6, 7 }),

        Arguments.of(new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6 }, 6, new int[] { 1, 2, 3, 4, 5, 6 }),

        Arguments.of(new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5 }, 5, new int[] { 1, 2, 3, 4, 5 })

    );

  }

}
