package main.java.com.amitraj.dsa.arrays;

import java.util.HashMap;

class Solution3 {
    public boolean containsDuplicate(int[] nums) {
        HashMap< Integer, Integer> indices = new HashMap<>();
        for ( int i =0; i<nums.length;i++){
            if ( indices.containsKey(nums[i]))
                return true;
            indices.put(nums[i], i);
        }

        return false;

    }
}