package org.example;

public class Case520 {

    public boolean detectCapitalUse(String word) {

        if (word.toUpperCase().equals(word)) {
            return true;
        }

        if (word.toLowerCase().equals(word)) {
            return true;
        }

        return word.substring(1).toLowerCase().equals(word.substring(1));
    }

//Runtime - 2ms  (38.75%)
//Memory - 41.99mb  (36.48%)
}

/**

520. Detect Capital
        Difficulty: Easy

        We define the usage of capitals in a word to be right when one of the following cases holds:

        All letters in this word are capitals, like "USA".
        All letters in this word are not capitals, like "leetcode".
        Only the first letter in this word is capital, like "Google".

        Given a string word, return true if the usage of capitals in it is right.



        Example 1:

        Input: word = "USA"
        Output: true

        Example 2:

        Input: word = "FlaG"
        Output: false



        Constraints:

        1 <= word.length <= 100
        word consists of lowercase and uppercase English letters.

*/
