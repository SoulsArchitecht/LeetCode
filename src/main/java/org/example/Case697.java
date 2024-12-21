package org.example;

import java.util.HashMap;
import java.util.Map;

public class Case697 {

    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Map<Integer, int[]> indexMap = new HashMap<>();

        int degree = 0;
        int shortestLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

            if (!indexMap.containsKey(num)) {
                indexMap.put(num, new int[] {i, i});
            } else {
                indexMap.get(num)[1] = i;
            }

            if (frequencyMap.get(num) > degree) {
                degree = frequencyMap.get(num);
                shortestLength = indexMap.get(num)[1] - indexMap.get(num)[0] + 1;
            } else if (frequencyMap.get(num) == degree) {
                shortestLength = Math.min(shortestLength, indexMap.get(num)[1] - indexMap.get(num)[0] + 1);
            }
        }

        return shortestLength;
    }

//Runtime - 36ms  (22.94%)
//Memory - 49.62mb  (6.99%)
}

/**

697. Degree of an Array
        Difficulty: Easy

        Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

        Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.



        Example 1:

        Input: nums = [1,2,2,3,1]
        Output: 2
        Explanation:
        The input array has a degree of 2 because both elements 1 and 2 appear twice.
        Of the subarrays that have the same degree:
        [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
        The shortest length is 2. So return 2.

        Example 2:

        Input: nums = [1,2,2,3,1,4,2]
        Output: 6
        Explanation:
        The degree is 3 because the element 2 is repeated 3 times.
        So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.



        Constraints:

        nums.length will be between 1 and 50,000.
        nums[i] will be an integer between 0 and 49,999.

*/
