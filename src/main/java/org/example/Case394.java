package org.example;

import java.util.Stack;

public class Case394 {

    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        StringBuilder currentString = new StringBuilder();
        int currentNumber = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            } else if (c == '[') {
                numberStack.push(currentNumber);
                stringStack.push(currentString.toString());

                currentString = new StringBuilder();
                currentNumber = 0;
            } else if (c == ']') {
                StringBuilder temp = currentString;
                currentString = new StringBuilder(stringStack.pop());
                int repeatCount = numberStack.pop();
                for (int i = 0; i < repeatCount; i++) {
                    currentString.append(temp);
                }
            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }

//Runtime - 1ms  (70.77%)
//Memory - 41.38mb  (84.48%)
}

/**


394. Decode String
        Difficulty: Medium

        Given an encoded string, return its decoded string.

        The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

        You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

        The test cases are generated so that the length of the output will never exceed 105.



        Example 1:

        Input: s = "3[a]2[bc]"
        Output: "aaabcbc"

        Example 2:

        Input: s = "3[a2[c]]"
        Output: "accaccacc"

        Example 3:

        Input: s = "2[abc]3[cd]ef"
        Output: "abcabccdcdcdef"



        Constraints:

        1 <= s.length <= 30
        s consists of lowercase English letters, digits, and square brackets '[]'.
        s is guaranteed to be a valid input.
        All the integers in s are in the range [1, 300].

*/
