package com.github.agrahul89.algorithms.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveValueInPlaceTest {

  @ParameterizedTest
  @MethodSource("testData")
  void testRemove(int[] nums, int remove, int expectedCount, int[] expectedValues) {
    assertThat(new RemoveValueInPlace().removeElement(nums, remove)).isEqualTo(expectedCount);
    assertThat(Arrays.copyOfRange(nums, 0, expectedCount)).contains(expectedValues);
  }

  private static Stream<Arguments> testData() {
    return Stream.of(

        Arguments.of(new int[] { 1 }, 1, 0, new int[] {}),

        Arguments.of(new int[] { 1, 2 }, 2, 1, new int[] { 1 }),

        Arguments.of(new int[] { 1, 2 }, 1, 1, new int[] { 2 }),

        Arguments.of(new int[] { 1, 2, 2 }, 2, 1, new int[] { 1 }),

        Arguments.of(new int[] { 1, 1, 2 }, 2, 2, new int[] { 1, 1 }),

        Arguments.of(new int[] { 1, 2, 3 }, 3, 2, new int[] { 1, 2 }),

        Arguments.of(new int[] { 1, 1, 1, 4, 4, 4 }, 4, 3, new int[] { 1, 1, 1 }),

        Arguments.of(new int[] { 1, 1, 1, 4, 4, 4 }, 1, 3, new int[] { 4, 4, 4 }),

        Arguments.of(new int[] { 1, 2, 2, 3, 4, 4, 5 }, 2, 5, new int[] { 1, 3, 4, 4, 5 }),

        Arguments.of(new int[] { 1, 2, 2, 3, 4, 4, 5 }, 4, 5, new int[] { 1, 2, 2, 3, 5 }),

        Arguments.of(new int[] { 1, 2, 2, 3, 4, 4, 5 }, 3, 6, new int[] { 1, 2, 2, 4, 4, 5 }),

        Arguments.of(new int[] { 1, 2, 2, 3, 4, 4, 5 }, 5, 6, new int[] { 1, 2, 2, 3, 4, 4 })

    );

  }

}
