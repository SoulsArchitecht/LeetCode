package org.example;

import java.util.*;

public class Case500 {

    public String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

        List<String> validWords = new ArrayList<>();

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();

            boolean isValid = true;
            Set<Character> currentRow = null;
            for (char c : lowerCaseWord.toCharArray()) {
                if (row1.contains(c)) {
                    if (currentRow == null) {
                        currentRow = row1;
                    } else if (currentRow != row1) {
                        isValid = false;
                        break;
                    }
                } else if (row2.contains(c)) {
                    if (currentRow == null) {
                        currentRow = row2;
                    } else if (currentRow != row2) {
                        isValid = false;
                        break;
                    }
                } else if (row3.contains(c)) {
                    if (currentRow == null) {
                        currentRow = row3;
                    } else if (currentRow != row3) {
                        isValid = false;
                        break;
                    }
                } else {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                validWords.add(word);
            }
        }

        return validWords.toArray(new String[0]);
    }

//Runtime - 1ms  (58.72%)
//Memory - 41.49mb  (69.36%)
}

/**

500. Keyboard Row
        Difficulty: Easy

        Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

        Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.

        In the American keyboard:

        the first row consists of the characters "qwertyuiop",
        the second row consists of the characters "asdfghjkl", and
        the third row consists of the characters "zxcvbnm".



        Example 1:

        Input: words = ["Hello","Alaska","Dad","Peace"]

        Output: ["Alaska","Dad"]

        Explanation:

        Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

        Example 2:

        Input: words = ["omk"]

        Output: []

        Example 3:

        Input: words = ["adsdf","sfd"]

        Output: ["adsdf","sfd"]



        Constraints:

        1 <= words.length <= 20
        1 <= words[i].length <= 100
        words[i] consists of English letters (both lowercase and uppercase).

*/
