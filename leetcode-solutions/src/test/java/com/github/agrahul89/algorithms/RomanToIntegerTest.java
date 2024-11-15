package com.github.agrahul89.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.github.agrahul89.algorithms.leetcode.RomanToInteger;

class RomanToIntegerTest {

  @ParameterizedTest(name = "{index}: {0} -> {1}")
  @CsvSource(delimiterString = " = ", textBlock = """
           I = 1
          II = 2
         III = 3
          IV = 4
           V = 5
          VI = 6
         VII = 7
        VIII = 8
          IX = 9
           X = 10
          XI = 11
         XII = 12
         XIV = 14
         XIX = 19
          XX = 20
         XXI = 21
        XXIV = 24
         XXV = 25
        XXVI = 26
        XXIX = 29
         XXX = 30
        XXXI = 31
       XXXIV = 34
        XXXV = 35
       XXXVI = 36
       XXXIX = 39
          XL = 40
         XLI = 41
        XLIV = 44
         XLV = 45
        XLVI = 46
        XLIX = 49
           L = 50
          LI = 51
         LIV = 54
          LV = 55
         LVI = 56
         LIX = 59
          LX = 60
         LXI = 61
        LXIV = 64
         LXV = 65
        LXVI = 66
        LXIX = 69
         LXX = 70
        LXXI = 71
       LXXIV = 74
        LXXV = 75
       LXXVI = 76
      LXXXIX = 89
          XC = 90
         XCI = 91
        XCIV = 94
         XCV = 95
           C = 100
          CI = 101
         CIV = 104
         CIX = 109
          CX = 110
         CXL = 140
       CXLIX = 149
          CL = 150
         CLI = 151
        CLIV = 154
        CLIX = 159
          CD = 400
         CDI = 401
        CDIV = 404
         CDV = 405
        CDVI = 406
        CDIX = 409
         CDX = 410
        CDXI = 411
        CDXL = 440
      CDXLIX = 449
         CDL = 450
        CDXC = 490
      CDXCIX = 499
           D = 500
          DC = 600
         DCC = 700
          CM = 900
      CMXCIX = 999
           M = 1000
         """)
  void testRomanToInt(String s, int expected) {
    RomanToInteger instance = new RomanToInteger();
    assertThat(instance.romanToInt(s)).isEqualTo(expected);
  }

}
