package org.example.CASE1967;

public class Case1967 {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                count++;
            }
        }
        return count;
    }

    //Runtime - 100%
    //Memory - 80.62%
}
