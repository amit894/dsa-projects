package com.amitraj.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> indicesByValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indicesByValue.containsKey(complement)) {
                return new int[] {indicesByValue.get(complement), i};
            }
            indicesByValue.put(nums[i], i);
        }
        return null;
    }
}
