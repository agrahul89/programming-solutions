package com.github.agrahul89.algorithms.leetcode.stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.github.agrahul89.algorithms.leetcode.stack.ValidParenthesis;

class ValidParenthesisTest {

  private ValidParenthesis valid = new ValidParenthesis();

  @ParameterizedTest
  @ValueSource(strings = { "()", "{}", "[]", "{()}", "[()]", "({})", "[{}]", "([])", "{[]}", "[{()}]", "{[()]}",
      "[({})]", "([{}])", "{([])}", "({[]})", "{()}[]", "(){}[]", "()[{}]" })
  void testIsValid(String s) {
    assertTrue(valid.isValid(s));
  }

  @ParameterizedTest
  @ValueSource(strings = { "(", ")", "{", "}", "[", "]", "(){", "{}[", "[](", "()[", "{}(", "({}])", "([{})", "({}]",
      "({[)}]]", "[{()}]({}]" })
  void testIsNotValid(String s) {
    assertFalse(valid.isValid(s));
  }

}
