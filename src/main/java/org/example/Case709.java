package org.example;

public class Case709 {

    public String toLowerCase(String s) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

//Runtime - 0ms  (100.00%)
//Memory - 41.34mb  (78.16%)
}

/**

709. To Lower Case
        Difficulty: Easy

        Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.



        Example 1:

        Input: s = "Hello"
        Output: "hello"

        Example 2:

        Input: s = "here"
        Output: "here"

        Example 3:

        Input: s = "LOVELY"
        Output: "lovely"



        Constraints:

        1 <= s.length <= 100
        s consists of printable ASCII characters.

*/
