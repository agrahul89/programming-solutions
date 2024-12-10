package com.github.agrahul89.algorithms.leetcode.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MergeSortedArrayTest {

  private MergeSortedArray merge = new MergeSortedArray();

  @ParameterizedTest
  @MethodSource("testData")
  void testMerge(int[] nums1, int m, int[] nums2, int n, int[] expected) {
    merge.merge(nums1, m, nums2, n);
    assertThat(nums1).contains(expected);
  }

  private static Stream<Arguments> testData() {
    return Stream.of(

        Arguments.of(new int[] {}, 0, new int[] {}, 0, new int[] {}),

        Arguments.of(new int[] { 1, 2, 3, 0, 0 }, 3, new int[] {}, 0, new int[] { 1, 2, 3, 0, 0 }),

        Arguments.of(new int[] { 0, 0, 0 }, 0, new int[] { 4, 5, 6 }, 3, new int[] { 4, 5, 6 }),

        Arguments.of(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 4, 5, 6 }, 3, new int[] { 1, 2, 3, 4, 5, 6 }),

        Arguments.of(new int[] { 4, 5, 6, 0, 0, 0 }, 3, new int[] { 1, 2, 3 }, 3, new int[] { 1, 2, 3, 4, 5, 6 }));
  }

}
