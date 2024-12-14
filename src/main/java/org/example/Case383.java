package org.example;

import java.util.HashMap;
import java.util.Map;

public class Case383 {

    public boolean canConstruct2(String ransomNote, String magazine) {
        boolean result = false;
        Map<String, Integer> textMap = new HashMap<>();
        Map<String, Integer> patternMap = new HashMap<>();

        String[] text = magazine.split("");
        String[] pattern = ransomNote.split("");

        for (String s : text) {
            if (!textMap.containsKey(s)) {
                textMap.put(s, 1);
            } else {
                textMap.put(s, textMap.get(s) + 1);
            }
        }

        for (String s : pattern) {
            if (!patternMap.containsKey(s)) {
                patternMap.put(s, 1);
            } else {
                patternMap.put(s, patternMap.get(s) + 1);
            }
        }

        for (Map.Entry<String, Integer> map : patternMap.entrySet()) {
            result = textMap.containsKey(map.getKey()) && textMap.get(map.getKey()) >= map.getValue();
            if (!result) {
                return false;
            }
        }

        return result;
    }

//Runtime - 41ms  (5.31%)
//Memory - 49.12mb  (5.81%)

    public boolean canContract(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            int count = magazineMap.getOrDefault(c, 0) + 1;
            magazineMap.put(c, count);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) < 1) {
                return false;
            }

            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        return true;
    }

//Runtime - 10ms  (61.06%)
//Memory - 44.99mb  (56.47%)
}

/**


383. Ransom Note
        Difficulty: Easy

        Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

        Each letter in magazine can only be used once in ransomNote.



        Example 1:

        Input: ransomNote = "a", magazine = "b"
        Output: false

        Example 2:

        Input: ransomNote = "aa", magazine = "ab"
        Output: false

        Example 3:

        Input: ransomNote = "aa", magazine = "aab"
        Output: true



        Constraints:

        1 <= ransomNote.length, magazine.length <= 105
        ransomNote and magazine consist of lowercase English letters.

*/
