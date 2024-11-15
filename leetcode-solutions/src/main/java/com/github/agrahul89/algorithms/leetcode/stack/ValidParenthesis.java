package com.github.agrahul89.algorithms.leetcode.stack;

import java.util.EmptyStackException;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

  public boolean isValid(String s) {
    if (s == null || s.trim().isEmpty())
      return false;

    Map<Character, Character> symbols = Map.of(')', '(', '}', '{', ']', '[');
    Stack<Character> stack = new Stack<>();

    for (char symbol : s.trim().toCharArray()) {
      if (symbol == '(' || symbol == '{' || symbol == '[')
        stack.push(symbol);
      else {
        try {
          if (!symbols.get(symbol).equals(stack.pop()))
            return false;
        } catch (final EmptyStackException ex) {
          return false;
        }
      }

    }
    return stack.isEmpty();
  }

}
