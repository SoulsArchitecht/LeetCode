package org.example;

public class Case69 {

    public int mySqrt(int x) {
        int y = 0;
        for (y = 0; y <= 46340; y++)
            if ( x == y * y) {
                return y;
            } else if (x  > y * y && x < (y + 1) * (y + 1)) {
                return y;
            }

        return y;
    }

    //2_147_483_647
//Runtime - 34ms  (5.19%)
//Memory - 40.58mb  (81.08%)

    //TODO sometimes work incorrect
    public int pySqrt2(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;

        while ( left <= right) {
            int mid = left + (right - left) / 2;

            if (mid * mid == x) {
                return mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}

/**

69. Sqrt(x)
        Difficulty: Easy

        Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

        You must not use any built-in exponent function or operator.

        For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.



        Example 1:

        Input: x = 4
        Output: 2
        Explanation: The square root of 4 is 2, so we return 2.

        Example 2:

        Input: x = 8
        Output: 2
        Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.



        Constraints:

        0 <= x <= 231 - 1

*/
