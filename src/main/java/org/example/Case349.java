package org.example;

import java.util.*;

public class Case349 {

    public int[] intersection (int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }

        for (int j : nums2) {
            if (map.containsKey(j)) {
                result.add(j);
            }
        }

        return result.stream()
                .mapToInt(Number::intValue)
                .toArray();
    }

//Runtime - 4ms  (33.72%)
//Memory - 43.79mb  (5.70%)
}

/**


349. Intersection of Two Arrays
        Difficulty: Easy

        Given two integer arrays nums1 and nums2, return an array of their
        intersection
        . Each element in the result must be unique and you may return the result in any order.



        Example 1:

        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2]

        Example 2:

        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [9,4]
        Explanation: [4,9] is also accepted.



        Constraints:

        1 <= nums1.length, nums2.length <= 1000
        0 <= nums1[i], nums2[i] <= 1000

*/
