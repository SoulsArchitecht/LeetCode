package org.example;

import java.util.*;

public class Case387 {

    public int firstUniqChar2(String s) {
        Map<String, Integer> abet = new LinkedHashMap<>();

        String[] letters = s.split("");
        for (int i = 0; i < s.length(); i++) {
            if (abet.containsKey(letters[i])) {
                abet.put(letters[i], abet.get(letters[i]) + 1);
            } else {
                abet.put(letters[i], 1);
            }
        }

        for (Map.Entry<String, Integer> entry : abet.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (value == 1) {
                return s.indexOf(key);
            }
        }

        return -1;
    }

//Runtime - 116ms  (5.62%)
//Memory - 55.44mb  (7.00%)

    public static int firstUniqChar(String s) {
        int[] charCount = new int[26];

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

//Runtime - 6ms  (80.61%)
//Memory - 45.16mb  (51.56%)
}

/**

387. First Unique Character in a String
        Difficulty: Easy

        Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



        Example 1:

        Input: s = "leetcode"

        Output: 0

        Explanation:

        The character 'l' at index 0 is the first character that does not occur at any other index.

        Example 2:

        Input: s = "loveleetcode"

        Output: 2

        Example 3:

        Input: s = "aabb"

        Output: -1



        Constraints:

        1 <= s.length <= 105
        s consists of only lowercase English letters.

*/

