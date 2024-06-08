package org.example.CASE523;

import java.util.HashMap;
import java.util.Map;

public class Case523 {

    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int minLength = 2;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) {
                sum %= k;
            }
            if (map.containsKey(sum)) {
                if (i - map.get(sum) >= minLength) {
                    return true;
                }
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }

//Runtime - 23ms  (56.21%)
//Memory - 57.49mb  (69.25%)

// next case not for big k over 2mlns.
    public boolean checkSubarraySum2(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = i + 1; i < nums.length; j++) {
                sum += nums[j];
                if ((sum % k == 0) && (j - 1 >= 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*
523. Continuous Subarray Sum
        Medium
        Topics
        Companies

        Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.

        A good subarray is a subarray where:

        its length is at least two, and
        the sum of the elements of the subarray is a multiple of k.

        Note that:

        A subarray is a contiguous part of the array.
        An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.



        Example 1:

        Input: nums = [23,2,4,6,7], k = 6
        Output: true
        Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.

        Example 2:

        Input: nums = [23,2,6,4,7], k = 6
        Output: true
        Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
        42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.

        Example 3:

        Input: nums = [23,2,6,4,7], k = 13
        Output: false



        Constraints:

        1 <= nums.length <= 105
        0 <= nums[i] <= 109
        0 <= sum(nums[i]) <= 231 - 1
        1 <= k <= 231 - 1
        */


