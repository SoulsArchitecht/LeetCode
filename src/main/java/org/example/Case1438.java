package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.TreeMap;

public class Case1438 {

    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int left = 0;
        int right = 0;

        for (; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            if (map.lastEntry().getKey() - map.firstEntry().getKey() > limit) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
        }

        return right - left;
    }

//Runtime - 103ms  (23.35%)
//Memory - 57.14mb  (29.80%)


/*    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxQueue = new ArrayDeque<>();
        Deque<Integer> minQueue = new ArrayDeque<>();

        int left = 0, right = 0, result = 0;

        while (right < nums.length) {
            while (!minQueue.isEmpty() && nums[right] > maxQueue.peekLast()) {
                maxQueue.pollLast();
            }
            while (!minQueue.isEmpty() && nums[right] < minQueue.peekLast()) {
                minQueue.pollLast();
            }

            maxQueue.offer(nums[right]);
            minQueue.offer(nums[right]);

            while (maxQueue.peekFirst() - minQueue.peekFirst() > limit) {
                if (maxQueue.peekFirst() == nums[left]) {
                    maxQueue.pollFirst();
                }
                if (minQueue.peekFirst() == nums[left]) {
                    minQueue.pollFirst();
                }
                left++;
            }

            result = Math.max(result, right - left + 1);
            right++;
        }

        return result;
    }*/
}

/**

1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
        (Medium)

        Given an array of integers nums and an integer limit, return the size of the longest non-empty subarray such that the absolute difference between any two elements of this subarray is less than or equal to limit.


        Example 1:
        Input: nums = [8,2,4,7], limit = 4
        Output: 2
        Explanation: All subarrays are:
        [8] with maximum absolute diff |8-8| = 0 <= 4.
        [8,2] with maximum absolute diff |8-2| = 6 > 4.
        [8,2,4] with maximum absolute diff |8-2| = 6 > 4.
        [8,2,4,7] with maximum absolute diff |8-2| = 6 > 4.
        [2] with maximum absolute diff |2-2| = 0 <= 4.
        [2,4] with maximum absolute diff |2-4| = 2 <= 4.
        [2,4,7] with maximum absolute diff |2-7| = 5 > 4.
        [4] with maximum absolute diff |4-4| = 0 <= 4.
        [4,7] with maximum absolute diff |4-7| = 3 <= 4.
        [7] with maximum absolute diff |7-7| = 0 <= 4.
        Therefore, the size of the longest subarray is 2.

        Example 2:
        Input: nums = [10,1,2,4,7,2], limit = 5
        Output: 4
        Explanation: The subarray [2,4,7,2] is the longest since the maximum absolute diff is |2-7| = 5 <= 5.

        Example 3:
        Input: nums = [4,2,2,2,4,4,2,2], limit = 0
        Output: 3

        Constraints:
        1 <= nums.length <= 105
        1 <= nums[i] <= 109
        0 <= limit <= 109

*/

