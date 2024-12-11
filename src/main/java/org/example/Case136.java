package org.example;

import java.util.HashMap;
import java.util.Map;

public class Case136 {

    public int singleNumber2(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

//Runtime - 13ms  (18.49%)
//Memory - 44.66mb  (97.37%)

    public int SingleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

//Runtime - 1ms  (99.86%)
//Memory - 46.09mb  (54.24%)
}

/**

136. Single Number
        Difficulty: Easy

        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

        You must implement a solution with a linear runtime complexity and use only constant extra space.



        Example 1:

        Input: nums = [2,2,1]
        Output: 1

        Example 2:

        Input: nums = [4,1,2,1,2]
        Output: 4

        Example 3:

        Input: nums = [1]
        Output: 1



        Constraints:

        1 <= nums.length <= 3 * 104
        -3 * 104 <= nums[i] <= 3 * 104
        Each element in the array appears twice except for one element which appears only once.

*/
