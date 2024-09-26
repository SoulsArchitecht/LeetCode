package org.example;

import java.util.HashMap;
import java.util.Map;

public class Case217 {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                return true;
            }
        }

        return false;
    }

//Runtime - 11ms  (72.18%)
//Memory - 60.15mb  (11.87%)
}

/**

217. Contains Duplicate
        Difficulty: Easy

        Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



        Example 1:

        Input: nums = [1,2,3,1]

        Output: true

        Explanation:

        The element 1 occurs at the indices 0 and 3.

        Example 2:

        Input: nums = [1,2,3,4]

        Output: false

        Explanation:

        All elements are distinct.

        Example 3:

        Input: nums = [1,1,1,3,3,4,3,2,4,2]

        Output: true



        Constraints:

        1 <= nums.length <= 105
        -109 <= nums[i] <= 109

*/
