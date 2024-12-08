package org.example;

public class Case28 {

    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

//Runtime - 0ms  (100.00%)
//Memory - 41.71mb  (17.78%)
}

/**


28. Find the Index of the First Occurrence in a String
        Difficulty: Easy

        Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



        Example 1:

        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.

        Example 2:

        Input: haystack = "leetcode", needle = "leeto"
        Output: -1
        Explanation: "leeto" did not occur in "leetcode", so we return -1.



        Constraints:

        1 <= haystack.length, needle.length <= 104
        haystack and needle consist of only lowercase English characters.

*/
