package org.example;

public class Case796 {

    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String s2 = s + s;

        return s2.contains(goal);
    }

//Runtime - 0ms  (100.00%)
//Memory - 41.01mb  (90.03%)
}

/**


796. Rotate String
        Difficulty: Easy

        Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

        A shift on s consists of moving the leftmost character of s to the rightmost position.

        For example, if s = "abcde", then it will be "bcdea" after one shift.



        Example 1:

        Input: s = "abcde", goal = "cdeab"
        Output: true

        Example 2:

        Input: s = "abcde", goal = "abced"
        Output: false



        Constraints:

        1 <= s.length, goal.length <= 100
        s and goal consist of lowercase English letters.

*/
