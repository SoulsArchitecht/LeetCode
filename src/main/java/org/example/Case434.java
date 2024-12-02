package org.example;

public class Case434 {

    public int countSegments(String s) {

        if (!s.trim().isEmpty()) {
            String[] segments = s.trim().split("\\s+");
            return segments.length;
        } else {
            return 0;
        }
    }

//Runtime - 1ms  (42.15%)
//Memory - 41.26mb  (47.27%)
}

/**

434. Number of Segments in a String
        Difficulty: Easy

        Given a string s, return the number of segments in the string.

        A segment is defined to be a contiguous sequence of non-space characters.



        Example 1:

        Input: s = "Hello, my name is John"
        Output: 5
        Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]

        Example 2:

        Input: s = "Hello"
        Output: 1



        Constraints:

        0 <= s.length <= 300
        s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
        The only space character in s is ' '.

*/

