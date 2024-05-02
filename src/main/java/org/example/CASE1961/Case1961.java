package org.example.CASE1961;

public class Case1961 {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder prefix = new StringBuilder();
        for (String word : words) {
            prefix.append(word);
            if (prefix.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}

//Runtime - 1ms  (87.60%)
//Memory - 42.68mb  (42.15%)