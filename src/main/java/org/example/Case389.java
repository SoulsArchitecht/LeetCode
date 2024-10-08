package org.example;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Case389 {

    public char findTheDifference(String s, String t) {

        int[] charCount = new int[26];

        for (char c : s.toCharArray()) {
            ++charCount[c - 'a'];
        }

        for (char c : t.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return c;
            }
            --charCount[c - 'a'];
        }

        throw new IllegalArgumentException();
    }

//Runtime - 2ms  (73.64%)
//Memory - 41.66mb  (61.44%)

    public char findTheDifference2(String s, String t) {
        final char sXors = (char) s.chars().reduce(0, (a, b) -> a ^ b);
        final char tXors = (char) s.chars().reduce(0, (a, b) -> a ^ b);

        return (char) (sXors ^ tXors);
    }

}

/**

389. Find the Difference
        Difficulty: Easy

        You are given two strings s and t.

        String t is generated by random shuffling string s and then add one more letter at a random position.

        Return the letter that was added to t.



        Example 1:

        Input: s = "abcd", t = "abcde"
        Output: "e"
        Explanation: 'e' is the letter that was added.

        Example 2:

        Input: s = "", t = "y"
        Output: "y"



        Constraints:

        0 <= s.length <= 1000
        t.length == s.length + 1
        s and t consist of lowercase English letters.

*/
