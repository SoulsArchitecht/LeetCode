package org.example;

import java.util.HashSet;
import java.util.Set;

public class Case507 {

    public boolean checkPerfectNumber(int num) {
        Set<Integer> result = new HashSet<>();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                result.add(num / i);
            }
        }
        int sum = result.stream().mapToInt(Integer::intValue).sum();

        return sum == num;
    }

//Runtime - 2093ms  (42.86%)
//Memory - 40.46mb  (30.13%)
}

/**

507. Perfect Number
        Difficulty: Easy

        A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

        Given an integer n, return true if n is a perfect number, otherwise return false.



        Example 1:

        Input: num = 28
        Output: true
        Explanation: 28 = 1 + 2 + 4 + 7 + 14
        1, 2, 4, 7, and 14 are all divisors of 28.

        Example 2:

        Input: num = 7
        Output: false



        Constraints:

        1 <= num <= 108

*/
