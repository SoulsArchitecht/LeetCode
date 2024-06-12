package org.example.CASE75;

public class Case75c {

    final int RED = 0;
    final int WHITE = 1;
    final int BLUE = 2;

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {

        int i = 0, j = 0, k = nums.length - 1;
        while (i <= k) {
            if (nums[i] == RED) {
                swap(nums, i, j);
                i++;
                j++;
            } else if (nums[i] == WHITE) {
                i++;
            } else if (nums[i] == BLUE) {
                swap(nums, i, k);
                k--;
            }
        }
    }

//Runtime - 0ms  (100.00%)
//Memory - 41.66mb  (60.77%)
}

/**

 75. Sort Colors

 Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 You must solve this problem without using the library's sort function.

 Example 1:
 Input: nums = [2,0,2,1,1,0]
 Output: [0,0,1,1,2,2]

 Example 2:
 Input: nums = [2,0,1]
 Output: [0,1,2]

 Constraints:
 n == nums.length
 1 <= n <= 300
 nums[i] is either 0, 1, or 2.

 Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 */