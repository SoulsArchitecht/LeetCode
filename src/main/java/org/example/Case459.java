package org.example;

public class Case459 {

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                int repetitions = n / i;

                StringBuilder repeatedSubstring = new StringBuilder();
                repeatedSubstring.append(substring.repeat(repetitions));

                if (repeatedSubstring.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }

//Runtime - 10ms  (89.03%)
//Memory - 45.25mb  (50.43%)
}

/**


459. Repeated Substring Pattern
        Difficulty: Easy

        Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.



        Example 1:

        Input: s = "abab"
        Output: true
        Explanation: It is the substring "ab" twice.

        Example 2:

        Input: s = "aba"
        Output: false

        Example 3:

        Input: s = "abcabcabcabc"
        Output: true
        Explanation: It is the substring "abc" four times or the substring "abcabc" twice.



        Constraints:

        1 <= s.length <= 104
        s consists of lowercase English letters.

*/
