package org.example;
import java.util.HashMap;
import java.util.Map;

public class Case3274 {

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int row1 = coordinate1.charAt(1) - '1';
        int col1 = coordinate1.charAt(0) - 'a';
        int row2 = coordinate2.charAt(1) - '1';
        int col2 = coordinate2.charAt(0) - 'a';

        return (row1 + col1) % 2 == (row2 + col2) % 2;
    }

//Runtime - 0ms  (100.00%)
//Memory - 42.28mb  (30.05%)

    public boolean checkTwoChessboards2(String coordinate1, String coordinate2) {

        Map<String, String> coordsMap = new HashMap<String, String>();
        String[] abets = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8"};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    coordsMap.put(abets[j] + nums[i], "black");
                } else {
                    coordsMap.put(abets[j] + nums[i], "white");
                }

            }
        }

        return coordsMap.get(coordinate1).equals(coordsMap.get(coordinate2));
    }
}

/**

3274. Check if Two Chessboard Squares Have the Same Color
    Difficulty: Easy

You are given two strings, coordinate1 and coordinate2, representing the coordinates of a square on an 8 x 8 chessboard.

Below is the chessboard for reference.

        Return true if these two squares have the same color and false otherwise.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first (indicating its column), and the number second (indicating its row).



Example 1:

Input: coordinate1 = "a1", coordinate2 = "c3"

Output: true

Explanation:

Both squares are black.

Example 2:

Input: coordinate1 = "a1", coordinate2 = "h3"

Output: false

Explanation:

Square "a1" is black and "h3" is white.



Constraints:

coordinate1.length == coordinate2.length == 2
        'a' <= coordinate1[0], coordinate2[0] <= 'h'
        '1' <= coordinate1[1], coordinate2[1] <= '8'

Seen this question in a real interview before?
        1/5*/
