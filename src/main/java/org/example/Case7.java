package org.example;

public class Case7 {

    public int reverse(int x) {

        String str = String.valueOf(x);
        StringBuilder result = new StringBuilder();
        int i = str.length() - 1;
        if (str.startsWith("-")) {
            result.append("-");
            while (i > 0) {
                result.append(str.charAt(i));
                i--;
            }
        } else {
            while (i > 0) {
                result.append(str.charAt(i));
                i--;
            }
            result.append(str.charAt(0));
        }

        long resultNumber = Long.parseLong(result.toString());

        if (resultNumber < Integer.MIN_VALUE || resultNumber > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) resultNumber;
        }
    }

//Runtime - 2ms  (14.11%)
//Memory - 41.14mb  (11.23%)


    public int reverse2(int x) {
        int rev = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            rev = rev * 10 + pop;
        }

        return rev;
    }

//Runtime - 0ms  (100.00%)
//Memory - 40.51mb  (85.09%)

}

/**

7. Reverse Integer
        Difficulty: Medium

        Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



        Example 1:

        Input: x = 123
        Output: 321

        Example 2:

        Input: x = -123
        Output: -321

        Example 3:

        Input: x = 120
        Output: 21



        Constraints:

        -231 <= x <= 231 - 1

*/
