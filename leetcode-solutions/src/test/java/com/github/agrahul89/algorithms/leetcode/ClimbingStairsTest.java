package com.github.agrahul89.algorithms.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ClimbingStairsTest {

  private static ClimbingStairs climb;

  @BeforeAll
  static void setup() {
    climb = new ClimbingStairs();
  }

  @ParameterizedTest
  @MethodSource("testData")
  void testClimbStairs(int steps, int expectedWays) {
    assertThat(climb.climbStairs(steps)).isEqualTo(expectedWays);
  }

  @ParameterizedTest
  @MethodSource("testData")
  void testClimbStairsBetter(int steps, int expectedWays) {
    assertThat(climb.climbStairs(steps)).isEqualTo(expectedWays);
  }

  private static Stream<Arguments> testData() {
    return Stream.of(

        Arguments.of(1, 1),

        Arguments.of(2, 2),

        Arguments.of(3, 3),

        Arguments.of(4, 5),

        Arguments.of(5, 8),

        Arguments.of(6, 13)

    );
  }

}
