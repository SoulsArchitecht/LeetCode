package org.example;

public class Case3151 {

    public boolean isArraySpecial(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) ||
            (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0)) {
                return false;
            }
        }

        return true;
    }

//Runtime - 0ms  (100.00%)
//Memory - 43.74mb  (13.27%)
}


/**

3151. Special Array I
    Difficulty: Easy

An array is considered special if the parity of every pair of adjacent elements is different. In other words, one element in each pair must be even, and the other must be odd.

You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.



Example 1:

Input: nums = [1]

Output: true

Explanation:

There is only one element. So the answer is true.

Example 2:

Input: nums = [2,1,4]

Output: true

Explanation:

There is only two pairs: (2,1) and (1,4), and both of them contain numbers with different parity. So the answer is true.

Example 3:

Input: nums = [4,3,1,6]

Output: false

Explanation:

nums[1] and nums[2] are both odd. So the answer is false.



Constraints:

        1 <= nums.length <= 100
        1 <= nums[i] <= 100

*/

