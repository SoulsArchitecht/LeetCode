package org.example;

import java.util.*;

public class Case1122 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            if (map.containsKey(num)) {
                int frequency = map.get(num);
                for (int i = 0; i < frequency; i++) {
                    result.add(num);
                }
                map.remove(num);
            }
        }

        List<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                remaining.add(num);
            }
        }

        Collections.sort(remaining);
        result.addAll(remaining);

        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }

//Runtime - 2ms  (56.06%)
//Memory - 42.04mb  (45.23%)
}

/**

1122. Relative Sort Array

        Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
        Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.


        Example 1:
        Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
        Output: [2,2,2,1,4,3,3,9,6,7,19]

        Example 2:
        Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
        Output: [22,28,8,6,17,44]

        Constraints:

        1 <= arr1.length, arr2.length <= 1000
        0 <= arr1[i], arr2[i] <= 1000
        All the elements of arr2 are distinct.
        Each arr2[i] is in arr1.

*/
