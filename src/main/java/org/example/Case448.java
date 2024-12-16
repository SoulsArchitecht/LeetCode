package org.example;

import java.util.ArrayList;
import java.util.List;

public class Case448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num) - 1;
            nums[index] = -Math.abs(nums[index]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

//Runtime - 6ms  (68.66%)
//Memory - 56.56mb  (28.09%)
}

/**

448. Find All Numbers Disappeared in an Array


        Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.



        Example 1:

        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]

        Example 2:

        Input: nums = [1,1]
        Output: [2]



        Constraints:

        n == nums.length
        1 <= n <= 105
        1 <= nums[i] <= n



        Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
*/
