package com.github.agrahul89.algorithms.leetcode.strings;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LengthOfLastWordTest {

  @ParameterizedTest()
  @CsvSource(delimiterString = " -> ", textBlock = """
      'a' -> 1
      ' a ' -> 1
      'a ' -> 1
      ' I     am   a 4  letter word' -> 4
      ' I  am  a  4  letter  word   ' -> 4
      """)
  void testLengthOfLastWord(String textToTest, int expectedWordLen) {
    assertThat(new LengthOfLastWord().lengthOfLastWord(textToTest)).isEqualTo(expectedWordLen);
  }

}
