package org.example;

public class Case974 {
    public int subarraysDivByK(int[] nums, int k) {
        int[] count = new int[k];
        int prefixSum = 0;
        int result = 0;

        count[0] = 1; // to handle s/arrays starting from index 0

        for (int num : nums) {
            prefixSum = (prefixSum + num) % k;
            if (prefixSum < 0) {
                prefixSum += k; // to handle negative remainder
            }

            result += count[prefixSum];
            count[prefixSum]++;
        }

        return result;
    }
//Runtime - 4ms  (89.40%)
//Memory - 45.58mb  (93.66%)
}

/**
 * 974. Subarray Sums Divisible by K

        Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

        A subarray is a contiguous part of an array.

        Example 1:
        Input: nums = [4,5,0,-2,-3,1], k = 5
        Output: 7
        Explanation: There are 7 subarrays with a sum divisible by k = 5:
        [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]

        Example 2:
        Input: nums = [5], k = 9
        Output: 0

        Constraints:
        1 <= nums.length <= 3 * 104
        -104 <= nums[i] <= 104
        2 <= k <= 104
 */


