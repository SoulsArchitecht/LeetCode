package org.example;

class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

public class Case206 {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

//Runtime - 0ms  (100.00%)
//Memory - 42.56mb  (28.80%)
}


/**

206. Reverse Linked List
        Difficulty: Easy

        Given the head of a singly linked list, reverse the list, and return the reversed list.



        Example 1:

        Input: head = [1,2,3,4,5]
        Output: [5,4,3,2,1]

        Example 2:

        Input: head = [1,2]
        Output: [2,1]

        Example 3:

        Input: head = []
        Output: []



        Constraints:

        The number of nodes in the list is the range [0, 5000].
        -5000 <= Node.val <= 5000
*/

