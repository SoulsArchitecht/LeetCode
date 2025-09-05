package org.example;

public class Case125 {

    public boolean isPalindrome(String s) {
        //String result = s.replaceAll("[^\\p{Alnum}]", "");
        String abet = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] sym = abet.toCharArray();
        int left = 0;
        int right = sym.length - 1;
        while (left < right) {
            if (sym[left] != sym[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

//Runtime - 13ms  (42.22%)
//Memory - 45.10mb  (29.55%)

    public boolean isPalindrome2(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetter(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetter(s.charAt(right))) {
                right--;
            }

            if (left < right) {
                char charLeft = Character.toLowerCase(s.charAt(left));
                char charRight = Character.toLowerCase(s.charAt(right));
                if (charLeft != charRight) {
                    return false;
                }

                left++;
                right--;
            }
        }
        return true;
    }
}


/** 125. Valid Palindrome
    Difficulty: Easy

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



        Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

        Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.



        Constraints:

        1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.*/


