package org.example;

public class Case441 {

    public int arrangeCoins(int n) {

        int level = 0;
        int remaining = n;

        while (remaining >= level + 1) {
            remaining -= level + 1;
            level++;
        }

        return level;
    }

//Runtime - 7ms  (31.11%)
//Memory - 41.01mb  (40.66%)
}

/**

441. Arranging Coins
        Difficulty: Easy

        You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

        Given the integer n, return the number of complete rows of the staircase you will build.



        Example 1:

        Input: n = 5
        Output: 2
        Explanation: Because the 3rd row is incomplete, we return 2.

        Example 2:

        Input: n = 8
        Output: 3
        Explanation: Because the 4th row is incomplete, we return 3.



        Constraints:

        1 <= n <= 231 - 1

*/
