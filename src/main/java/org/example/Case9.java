package org.example;

import java.util.Arrays;

public class Case9 {

    public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        int[] digits = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++)
        {
            digits[i] = temp.charAt(i) - '0';
        }

        int[] reverse = new int[digits.length];

        for (int i = digits.length -1, j = 0; i >= 0; i--, j++) {
            reverse[j] = digits[i];
        }

        return Arrays.equals(reverse, digits);

    }

//Runtime - 7ms  (17.81%)
//Memory - 43.51mb  (91.28%)
}

/**

9. Palindrome Number
        Difficulty: Easy

        Given an integer x, return true if x is a
        palindrome
        , and false otherwise.

        Example 1:
        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.

        Example 2:
        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

        Example 3:
        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


        Constraints:

        -231 <= x <= 231 - 1

        Follow up: Could you solve it without converting the integer to a string?

*/
