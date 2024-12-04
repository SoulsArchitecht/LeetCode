package org.example;

import java.util.HashSet;

public class Case771 {

    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsSet = new HashSet<>();

        for (int i = 0; i < jewels.length(); i++) {
            jewelsSet.add(jewels.charAt(i));
        }

        int result = 0;
        for (int i = 0 ; i < stones.length(); i++) {
            if (jewelsSet.contains(stones.charAt(i))) {
                result++;
            }
        }

        return result;
    }

//Runtime - 1ms  (61.84%)
//Memory - 41.99mb  (20.88%)
}

/**

771. Jewels and Stones
        Difficulty: Easy

        You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

        Letters are case sensitive, so "a" is considered a different type of stone from "A".



        Example 1:

        Input: jewels = "aA", stones = "aAAbbbb"
        Output: 3

        Example 2:

        Input: jewels = "z", stones = "ZZ"
        Output: 0



        Constraints:

        1 <= jewels.length, stones.length <= 50
        jewels and stones consist of only English letters.
        All the characters of jewels are unique.

*/

