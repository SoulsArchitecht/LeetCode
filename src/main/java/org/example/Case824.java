package org.example;

public class Case824 {

    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("a") || words[i].startsWith("e") || words[i].startsWith("i") ||
                    words[i].startsWith("o")|| words[i].startsWith("u") || words[i].startsWith("A") ||
                    words[i].startsWith("E") || words[i].startsWith("I") ||
                    words[i].startsWith("O")|| words[i].startsWith("U")){
                result.append(words[i]).append("ma");
            } else {
                result.append(words[i].substring(1)).append(words[i].charAt(0)).append("ma");
            }

            result.append("a".repeat(i + 1));
            result.append(" ");
        }

        return result.toString().trim();
    }

//Runtime - 1ms  (100.00%)
//Memory - 41.84mb  (69.93%)
}

/**

824. Goat Latin
        Difficulty: Easy

        You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.

        We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:

        If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
        For example, the word "apple" becomes "applema".
        If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
        For example, the word "goat" becomes "oatgma".
        Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
        For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.

        Return the final sentence representing the conversion from sentence to Goat Latin.



        Example 1:

        Input: sentence = "I speak Goat Latin"
        Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

        Example 2:

        Input: sentence = "The quick brown fox jumped over the lazy dog"
        Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"



        Constraints:

        1 <= sentence.length <= 150
        sentence consists of English letters and spaces.
        sentence has no leading or trailing spaces.
        All the words in sentence are separated by a single space.

*/

