package org.example;

import java.util.HashMap;
import java.util.Map;

public class Case645 {

    public int[] findErrorNums2(int[] nums) {

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int duplicate = -1;
        int missing = -1;

        for (int i = 1; i <= nums.length; i++) {
            if (countMap.getOrDefault(i, 0) == 2) {
                duplicate = i;
            } else if (countMap.getOrDefault(i, 0) == 0) {
                missing = i;
            }
        }

        return new int[] {duplicate, missing};
    }

//Runtime - 18ms  (11.59%)
//Memory - 46.06mb  (11.72%)

    public int[] findErrorNums(int[] nums) {

        int[] result = new int[2];

        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) {
                result[0] = Math.abs(num);
            } else {
                nums[Math.abs(num) - 1] *= -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1;
            }
        }

        return result;
    }

//Runtime - 3ms  (83.24%)
//Memory - 45.25mb  (88.83%)
}

/**


645. Set Mismatch
        Difficulty: Easy

        You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

        You are given an integer array nums representing the data status of this set after the error.

        Find the number that occurs twice and the number that is missing and return them in the form of an array.



        Example 1:

        Input: nums = [1,2,2,4]
        Output: [2,3]

        Example 2:

        Input: nums = [1,1]
        Output: [1,2]



        Constraints:

        2 <= nums.length <= 104
        1 <= nums[i] <= 104

*/
