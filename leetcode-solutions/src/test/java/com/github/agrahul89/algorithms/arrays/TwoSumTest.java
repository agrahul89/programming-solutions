package com.github.agrahul89.algorithms.arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.github.agrahul89.algorithms.leetcode.arrays.TwoSum;

class TwoSumTest {

  TwoSum instance;

  @BeforeEach
  void setup() {
    instance = new TwoSum();
  }

  @ParameterizedTest()
  @MethodSource("positiveTestData")
  void testOnePassShouldPass(int[] nums, int target, int[] expected) {
    int[] actual = instance.onePass(nums, target);
    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("negativeTestData")
  void testOnePassShouldFail(int[] nums, int target) {
    int[] actual = instance.onePass(nums, target);
    assertThat(actual).isEmpty();
  }

  @ParameterizedTest()
  @MethodSource("positiveTestData")
  void testTwoPassShouldPass(int[] nums, int target, int[] expected) {
    int[] actual = instance.twoPass(nums, target);
    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("negativeTestData")
  void testTwoPassShouldFail(int[] nums, int target) {
    int[] actual = instance.twoPass(nums, target);
    assertThat(actual).isEmpty();
  }

  private static Stream<Arguments> positiveTestData() {
    return Stream.of(

        Arguments.of(new int[] { 4, 5, 3, 6, 1 }, 5, new int[] { 0, 4 }),

        Arguments.of(new int[] { 2, 3, 4, 5, 6 }, 6, new int[] { 0, 2 }),

        Arguments.of(new int[] { 2, 6, 1, 4, 3 }, 6, new int[] { 0, 3 }),

        Arguments.of(new int[] { -3, 7, 8, -5, 11 }, 6, new int[] { 3, 4 }));
  }

  private static Stream<Arguments> negativeTestData() {
    return Stream.of(

        Arguments.of(null, 5),

        Arguments.of(new int[] { 5 }, 5),

        Arguments.of(new int[] { -4, 5, 8, 6, -2 }, 5),

        Arguments.of(new int[] { 7, 3, 4, 5, 6 }, 6),

        Arguments.of(new int[] { 3, 6, 1, 4, 5 }, 0));
  }

}
