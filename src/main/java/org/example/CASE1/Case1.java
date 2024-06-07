package org.example.CASE1;

import java.util.HashMap;
import java.util.Map;

public class Case1 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[] {map.get(comp), i };
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution");
    }
}

//Runtime - 2ms  (97.73%)
//Memory - 44.98mb  (22.74%)
