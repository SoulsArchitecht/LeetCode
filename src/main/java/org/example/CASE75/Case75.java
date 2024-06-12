package org.example.CASE75;

public class Case75 {

    static final int RED = 0;
    static final int WHITE = 1;
    static final int BLUE = 2;


    public int[] sortColors(int[] nums) {
        int counterRed = 0;
        int counterWhite = 0;
        int counterBlue = 0;

        for (int num : nums) {
            switch (num) {
                case RED -> counterRed++;
                case WHITE -> counterWhite++;
                case BLUE -> counterBlue++;
                default -> throw new IllegalArgumentException("Incorrect array");
            }
        }

        int[] sortedArray = new int[nums.length];

        for (int i = 0; i < counterRed; i++) {
            sortedArray[i] = RED;
        }
        for (int j = counterRed; j < counterRed + counterWhite; j++) {
            sortedArray[j] = WHITE;
        }
        for (int k = counterRed + counterWhite; k < counterWhite + counterRed + counterBlue; k++) {
            sortedArray[k] = BLUE;
        }

        return sortedArray;
    }
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

