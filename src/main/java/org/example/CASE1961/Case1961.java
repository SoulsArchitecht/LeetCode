package org.example.CASE1961;

public class Case1961 {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder result = new StringBuilder();
        int length = words[0].length();
        for (String word : words) {
            result.append(word);
        }
        return (result.toString().startsWith(s) && s.length() == length);
    }
}

//Runtime - 1ms  (87.60%)
//Memory - 42.68mb  (42.15%)