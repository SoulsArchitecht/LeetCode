package org.example;

public class Case3304 {

    public char kthCharacter(int k) {

        StringBuilder word = new StringBuilder("a");
        int length = 1;

        while (length < k) {
            StringBuilder nextString = new StringBuilder();
            int stringLength = word.length();

            for (int i = 0; i < stringLength; i++) {
                char currentChar = word.charAt(i);
                char nextChar = (char) (((currentChar - 'a' + 1) % 26) + 'a');
                nextString.append(nextChar);
            }

            word.append(nextString);
            length += stringLength;
        }

        return word.charAt(k - 1);
    }

//Runtime - 3ms  (73.59%)
//Memory - 42.66mb  (59.33%)
}

/**

3304. Find the K-th Character in String Game I
    Difficulty: Easy

Alice and Bob are playing a game. Initially, Alice has a string word = "a".

You are given a positive integer k.

Now Bob will ask Alice to perform the following operation forever:

Generate a new string by changing each character in word to its next character in the English alphabet, and append it to the original word.

        For example, performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".

Return the value of the kth character in word, after enough operations have been done for word to have at least k characters.

Note that the character 'z' can be changed to 'a' in the operation.



        Example 1:

Input: k = 5

Output: "b"

Explanation:

Initially, word = "a". We need to do the operation three times:

Generated string is "b", word becomes "ab".
Generated string is "bc", word becomes "abbc".
Generated string is "bccd", word becomes "abbcbccd".

Example 2:

Input: k = 10

Output: "c"



Constraints:

        1 <= k <= 500

*/
