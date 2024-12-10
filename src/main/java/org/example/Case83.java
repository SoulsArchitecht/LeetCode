package org.example;


public class Case83 {

    public ListNodeND deleteDuplicates(ListNodeND head) {

        if (head == null) {
            return null;
        }

        ListNodeND current = head;

        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

//Runtime - 0ms  (100.00%)
//Memory - 44.00mb  (50.77%)

    public static class ListNodeND {
        int val;
        ListNodeND next;
        ListNodeND() {}
        ListNodeND (int val) {this.val = val;}
        ListNodeND (int val, ListNodeND next) {
            this.val = val;
            this.next = next;
        }
    }
}

/**

83. Remove Duplicates from Sorted List
        Difficulty: Easy

        Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.



        Example 1:

        Input: head = [1,1,2]
        Output: [1,2]

        Example 2:

        Input: head = [1,1,2,3,3]
        Output: [1,2,3]



        Constraints:

        The number of nodes in the list is in the range [0, 300].
        -100 <= Node.val <= 100
        The list is guaranteed to be sorted in ascending order.

*/

