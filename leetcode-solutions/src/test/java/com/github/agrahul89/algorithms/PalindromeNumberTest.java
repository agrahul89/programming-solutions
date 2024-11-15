package com.github.agrahul89.algorithms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.github.agrahul89.algorithms.leetcode.PalindromeNumber;

class PalindromeNumberTest {

  @ParameterizedTest()
  @ValueSource(ints = { 0, 11, 121, 1221, 12321, 123321, 1234321, 12344321, 123454321, 1234554321, 9999_9999 })
  void testPalindrome1ShouldPass(int x) {
    assertTrue(new PalindromeNumber().inPlaceSolution(x));
  }

  @ParameterizedTest
  @ValueSource(ints = { -121, -11, 1231, 123421, 9998_9999 })
  void testPalindrome1ShouldFail(int x) {
    assertFalse(new PalindromeNumber().inPlaceSolution(x));
  }

  @ParameterizedTest()
  @ValueSource(ints = { 0, 11, 121, 1221, 12321, 123321, 1234321, 12344321, 123454321, 1234554321, 9999_9999 })
  void testPalindrome2ShouldPass(int x) {
    assertTrue(new PalindromeNumber().inPlaceSolutionBetter(x));
  }

  @ParameterizedTest
  @ValueSource(ints = { -121, -11, 1231, 123421, 9998_9999 })
  void testPalindrome2ShouldFail(int x) {
    assertFalse(new PalindromeNumber().inPlaceSolutionBetter(x));
  }

  @ParameterizedTest()
  @ValueSource(ints = { 0, 11, 121, 1221, 12321, 123321, 1234321, 12344321, 123454321, 1234554321, 9999_9999 })
  void testPalindrome3ShouldPass(int x) {
    assertTrue(new PalindromeNumber().inPlaceSolutionBest(x));
  }

  @ParameterizedTest
  @ValueSource(ints = { -121, -11, 1231, 123421, 9998_9999 })
  void testPalindrome3ShouldFail(int x) {
    assertFalse(new PalindromeNumber().inPlaceSolutionBest(x));
  }

  @ParameterizedTest()
  @ValueSource(ints = { 0, 11, 121, 1221, 12321, 123321, 1234321, 12344321, 123454321, 1234554321, 9999_9999 })
  void testPalindromeAsStringShouldPass(int x) {
    assertTrue(new PalindromeNumber().asStringSolution(x));
  }

  @ParameterizedTest
  @ValueSource(ints = { -121, -11, 1231, 123421, 9998_9999 })
  void testPalindromeAsStringShouldFail(int x) {
    assertFalse(new PalindromeNumber().asStringSolution(x));
  }

}
