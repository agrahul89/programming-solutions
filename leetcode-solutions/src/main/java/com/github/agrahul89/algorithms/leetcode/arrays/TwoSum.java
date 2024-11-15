package com.github.agrahul89.algorithms.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

  public int[] onePass(int[] nums, int target) {
    int[] result = {};
    if (nums == null || nums.length < 2)
      return result;

    Map<Integer, Integer> valuePositions = HashMap.newHashMap(nums.length);

    int currentIndex = 0;
    do {
      Integer previousIndex = valuePositions.get(target - nums[currentIndex]);
      if (previousIndex == null)
        valuePositions.putIfAbsent(nums[currentIndex], currentIndex);
      else {
        result = new int[] { previousIndex, currentIndex };
        break;
      }
    } while (++currentIndex < nums.length);

    return result;
  }

  public int[] twoPass(int[] nums, int target) {
    int[] result = {};
    if (nums == null || nums.length < 2)
      return result;

    Map<Integer, Integer> valuePositions = HashMap.newHashMap(nums.length);
    for (int i = 0; i < nums.length; i++) {
      valuePositions.putIfAbsent(nums[i], i);
    }

    for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
      Integer previousIndex = valuePositions.get(target - nums[currentIndex]);
      if (previousIndex != null && previousIndex != currentIndex) {
        result = new int[] { previousIndex, currentIndex };
      }
    }
    return result;
  }

}
