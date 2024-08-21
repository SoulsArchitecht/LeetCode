package org.example;

public class Case344 {

    public void reverseString(char[] s) {
        for (int i = s.length - 1, j = 0; j < i; i--, j++) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }
    }

//Runtime - 0ms  (100.00%)
//Memory - 49.25mb  (26.09%)

    public void reverseString2(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (right > left) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

//Runtime - 0ms  (100.00%)
//Memory - 49.14mb  (32.43%)
}

/**

344. Reverse String
        Difficulty: Easy

        Write a function that reverses a string. The input string is given as an array of characters s.

        You must do this by modifying the input array in-place with O(1) extra memory.



        Example 1:

        Input: s = ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]

        Example 2:

        Input: s = ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"]



        Constraints:

        1 <= s.length <= 105
        s[i] is a printable ascii character.

*/
