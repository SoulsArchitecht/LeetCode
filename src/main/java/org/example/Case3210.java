package org.example;

public class Case3210 {

    public String getEncryptedString(String s,int k) {
        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[(i + k) % chars.length];
        }
        return new String(result);
    }

//Runtime - 1ms  (100.00%)
//Memory - 42.41mb  (93.08%)
}

/**

3210. Find the Encrypted String
    Difficulty: Easy

You are given a string s and an integer k. Encrypt the string using the following algorithm:

For each character c in s, replace c with the kth character after c in the string (in a cyclic manner).

Return the encrypted string.



Example 1:

Input: s = "dart", k = 3

Output: "tdar"

Explanation:

        For i = 0, the 3rd character after 'd' is 't'.
        For i = 1, the 3rd character after 'a' is 'd'.
        For i = 2, the 3rd character after 'r' is 'a'.
        For i = 3, the 3rd character after 't' is 'r'.

Example 2:

Input: s = "aaa", k = 1

Output: "aaa"

Explanation:

As all the characters are the same, the encrypted string will also be the same.



Constraints:

        1 <= s.length <= 100
        1 <= k <= 104
s consists only of lowercase English letters.

*/

