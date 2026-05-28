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
        HashMap<Integer,Integer> indices = new HashMap<>();
       for ( int i=0; i< nums.length;i++){
           if (indices.containsKey(target-nums[i]))
               return new int[]{i, indices.get(target-nums[i])};
           indices.put(nums[i],i);
       }
       return null;

    }
}
