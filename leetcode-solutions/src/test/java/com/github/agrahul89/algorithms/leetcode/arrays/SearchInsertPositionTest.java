package com.github.agrahul89.algorithms.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SearchInsertPositionTest {

  @ParameterizedTest
  @MethodSource("testData")
  void testSearchInsert(int[] nums, int target, int expectedIdxPos) {
    assertThat(new SearchInsertPosition().searchInsert(nums, target)).isEqualTo(expectedIdxPos);
  }

  private static Stream<Arguments> testData() {
    return Stream.of(

        Arguments.of(new int[] { -10, -5, -1, 0, 1, 5, 10 }, -100, 0),

        Arguments.of(new int[] { -10, -5, -1, 0, 1, 5, 10 }, 0, 3),

        Arguments.of(new int[] { -10, -5, -1, 0, 1, 5, 10 }, -5, 1),

        Arguments.of(new int[] { -10, -5, -1, 0, 1, 5, 10 }, 1, 4),

        Arguments.of(new int[] { -10, -5, -1, 0, 1, 5, 10 }, 100, 7),

        Arguments.of(new int[] { -10, -5, -1, 1, 5, 10 }, -100, 0),

        Arguments.of(new int[] { -10, -5, -1, 1, 5, 10 }, 0, 3),

        Arguments.of(new int[] { -10, -5, -1, 1, 5, 10 }, -5, 1),

        Arguments.of(new int[] { -10, -5, -1, 1, 5, 10 }, 1, 3),

        Arguments.of(new int[] { -10, -5, -1, 1, 5, 10 }, 100, 6)

    );

  }

}
