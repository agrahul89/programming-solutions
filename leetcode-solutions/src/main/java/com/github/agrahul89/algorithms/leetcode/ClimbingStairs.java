package com.github.agrahul89.algorithms.leetcode;

/**
 * https://leetcode.com/problems/climbing-stairs
 */
public class ClimbingStairs {
  public int climbStairs(int n) {
    int[] steps = new int[n + 1];
    steps[0] = 1;
    steps[1] = 1;

    for (int i = 2; i <= n; i++) {
      steps[i] = steps[i - 1] + steps[i - 2];
    }

    return steps[n];
  }

  public int climbStairsBetter(int n) {
    int prev2 = 1;
    int prev1 = 1;

    for (int i = 2; i <= n; i++) {
      int next = prev2 + prev1;
      prev2 = prev1;
      prev1 = next;
    }

    return prev1;
  }

  public static void main(String[] args) {
    ClimbingStairs climb = new ClimbingStairs();
    System.out.println(climb.climbStairs(1));
    System.out.println(climb.climbStairs(2));
    System.out.println(climb.climbStairs(3));
    System.out.println(climb.climbStairs(4));
    System.out.println(climb.climbStairs(5));
    System.out.println(climb.climbStairs(6));
    System.out.println(climb.climbStairsBetter(1));
    System.out.println(climb.climbStairsBetter(2));
    System.out.println(climb.climbStairsBetter(3));
    System.out.println(climb.climbStairsBetter(4));
    System.out.println(climb.climbStairsBetter(5));
    System.out.println(climb.climbStairsBetter(6));
  }
}