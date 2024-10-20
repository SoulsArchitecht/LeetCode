package org.example;

public class Case1935 {

    public int canBeTypedWords(String text, String brokenLetters) {

        String[] words = text.split(" ");
        String[] letters = brokenLetters.split("");
        int extCount = 0;

        if (brokenLetters.equals("")) {
            return words.length;
        }

        for (String word : words) {
            int intCount = 0;
            for (String letter : letters) {
                if (word.contains(letter)) {
                    intCount++;
                }
            }
            if (intCount == 0) {
                extCount++;
            }
        }

        return extCount;
    }

//Runtime - 5ms  (31.26%)
//Memory - 42.19mb  (65.73%)

    public int canBeTypedWords2(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        boolean[] brokenKeys = new boolean[26];

        for (char c : brokenLetters.toCharArray()) {
            brokenKeys[c - 'a'] = true;
        }

        for (String word : words) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (brokenKeys[c - 'a']) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                count++;
            }
        }

        return count;
    }
}

/**

1935. Maximum Number of Words You Can Type
        Difficulty: Easy

        There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

        Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.



        Example 1:

        Input: text = "hello world", brokenLetters = "ad"
        Output: 1
        Explanation: We cannot type "world" because the 'd' key is broken.

        Example 2:

        Input: text = "leet code", brokenLetters = "lt"
        Output: 1
        Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.

        Example 3:

        Input: text = "leet code", brokenLetters = "e"
        Output: 0
        Explanation: We cannot type either word because the 'e' key is broken.



        Constraints:

        1 <= text.length <= 104
        0 <= brokenLetters.length <= 26
        text consists of words separated by a single space without any leading or trailing spaces.
        Each word only consists of lowercase English letters.
        brokenLetters consists of distinct lowercase English letters.

*/
