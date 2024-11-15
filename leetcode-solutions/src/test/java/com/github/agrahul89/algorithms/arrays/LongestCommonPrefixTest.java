package com.github.agrahul89.algorithms.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.github.agrahul89.algorithms.leetcode.arrays.LongestCommonPrefix;

class LongestCommonPrefixTest {

  private LongestCommonPrefix lcp = new LongestCommonPrefix();

  @ParameterizedTest
  @MethodSource("data")
  void testLongestCommonPrefix(String[] strs, String expected) {
    assertThat(lcp.longestCommonPrefix(strs)).isEqualTo(expected);
  }

  @ParameterizedTest
  @MethodSource("data")
  void testLongestCommonPrefixSolutionBest(String[] strs, String expected) {
    assertThat(lcp.longestCommonPrefix(strs)).isEqualTo(expected);
  }

  private static Stream<Arguments> data() {
    return Stream.of(Arguments.of(Stream.of("flower", "flow", "flight").toArray(String[]::new), "fl"),

        Arguments.of(Stream.of("cecil", "cect", "celereon").toArray(String[]::new), "ce"),

        Arguments.of(Stream.of("cylinder", "cinderella", "cyclops").toArray(String[]::new), "c"),

        Arguments.of(Stream.of("cinderella", "cinders").toArray(String[]::new), "cinder"),

        Arguments.of(Stream.of("dock", "doctor", "docket", "doctorate", "doc").toArray(String[]::new), "doc"),

        Arguments.of(Stream.of("parrot", "parmezan").toArray(String[]::new), "par"),

        Arguments.of(Stream.of("pantry", "panther", "panama", "pants", "pan-asia", "panda", "panzer", "pancko", "pan")
            .toArray(String[]::new), "pan"),

        Arguments.of(
            Stream.of("random", "values", "that", "do", "not", "have", "any", "thing", "common").toArray(String[]::new),
            ""));
  }

}
