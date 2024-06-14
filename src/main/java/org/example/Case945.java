package org.example;

import java.util.Arrays;

public class Case945 {

    public int minIncrementForUnique(int[] nums) {

        Arrays.sort(nums);
        int moves = 0;

        for (int i = 1; i < nums.length; ++i) {

            if (nums[i] <= nums[i - 1]) {
                int difference = nums[i - 1] - nums[i] + 1;
                nums[i] += difference;
                moves += difference;
            }
        }

        return moves;
    }

//Runtime - 37ms  (72.13%)
//Memory - 60.04mb  (51.48%)

/*    public int minIncrementForUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return calculateMoves(countMap, 0);
    }

    private int calculateMoves(HashMap<Integer, Integer> countMap, int num) {
        if (!countMap.containsKey(num) || countMap.get(num) == 0) {
            return 0;
        }

        int movesNext = calculateMoves(countMap, num + 1);
        int increment = Math.max(0, countMap.get(num) - 1);
        countMap.put(num + 1, countMap.getOrDefault(num + 1, 0) + increment);
        countMap.put(num, 1);

        return movesNext + increment;
    }*/

/*    public int minIncrementForUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] count = new int[80000];
        int max = -1, moves = 0;

        for (int num : nums) {
            count[num]++;
            max = Math.max(max, num);
        }

        for (int i = 0; i <= max; i++) {
            if (count[i] > 1) {
                int extra = count[i] - 1;
                moves += extra;
                count[i + 1] += extra;
            }
        }

        int extra = count[max] - 1;
        moves += (extra * (extra + 1)) / 2;

        return moves;
    }*/

/*    public int minIncrementForUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int moves = 0;
        for (int i = 1; i < nums.length; i++) {
            map.put(i, nums[i]);
            if (map.containsValue(nums[i])) {
                map.put(i, nums[i] + 1);
                moves++;
                minIncrementForUnique(nums);
            } else {
                break;
            }
        }

        return moves;
    }*/
}

/**

945. Minimum Increment to Make Array Unique

        You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.

        Return the minimum number of moves to make every value in nums unique.

        The test cases are generated so that the answer fits in a 32-bit integer.

        Example 1:
        Input: nums = [1,2,2]
        Output: 1
        Explanation: After 1 move, the array could be [1, 2, 3].

        Example 2:
        Input: nums = [3,2,1,2,1,7]
        Output: 6
        Explanation: After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
        It can be shown with 5 or less moves that it is impossible for the array to have all unique values.

        Constraints:
        1 <= nums.length <= 105
        0 <= nums[i] <= 105

*/

