package org.example;

public class Case1248 {

    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int count = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 1) {
                k--;
            }
            while (k < 0) {
                if (nums[left] % 2 == 1) {
                    k++;
                }
                left++;
            }
            count += right - left + 1;
        }

        return count;
    }

//Runtime - 268ms  (5.05%)
//Memory - 55.42mb  (12.84%)
}

/**
1248. Count Number of Nice Subarrays

        Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

        Return the number of nice sub-arrays.

        Example 1:
        Input: nums = [1,1,2,1,1], k = 3
        Output: 2
        Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

        Example 2:
        Input: nums = [2,4,6], k = 1
        Output: 0
        Explanation: There are no odd numbers in the array.

        Example 3:
        Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
        Output: 16

        Constraints:

        1 <= nums.length <= 50000
        1 <= nums[i] <= 10^5
        1 <= k <= nums.length
*/

