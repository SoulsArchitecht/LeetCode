package org.example;

import java.util.HashSet;

public class Case345 {

    public String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            while (left < right && vowels.indexOf(letters[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(letters[right]) == -1) {
                right++;
            }

            if (left < right) {
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right++;
            }
        }

        return new String(letters);
    }

//Runtime - 3ms  (79.86%)
//Memory - 44.60mb  (92.71%)
}

/**

345. Reverse Vowels of a String
        Difficulty: Easy

        Given a string s, reverse only all the vowels in the string and return it.

        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



        Example 1:

        Input: s = "IceCreAm"

        Output: "AceCreIm"

        Explanation:

        The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

        Example 2:

        Input: s = "leetcode"

        Output: "leotcede"



        Constraints:

        1 <= s.length <= 3 * 105
        s consist of printable ASCII characters.

*/
