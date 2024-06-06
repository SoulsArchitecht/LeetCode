package org.example.CASE1963;

public class Case1963 {
    public int minSwaps(String s) {

        int n = s.length();

        if (n % 2 != 0) {
            System.out.println("input String is incorrect! Need Sting with even length");
            return -1;
        }

        char[] array = s.toCharArray();
        int mismatched = 0;

        for (char c : array) {
            if (c == '[') {
                ++mismatched;
            } else if (mismatched > 0) {
                --mismatched;
            }
        }

        return (mismatched + 1) / 2;
    }
}

//Runtime - 13ms  (93.24%)
//Memory - 55.85mb  (20.62%)
