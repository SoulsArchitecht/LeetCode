package org.example;

 //Definition for a binary tree node.
 class MyTreeNode {
     int val;
     MyTreeNode left;
     MyTreeNode right;
     MyTreeNode() {}
     MyTreeNode(int val) { this.val = val; }
     MyTreeNode(int val, MyTreeNode left, MyTreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class Case104 {
    public int maxDepth(MyTreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

//Runtime - 0ms  (100.00%)
//Memory - 42.82mb  (15.76%)
}

/**

104. Maximum Depth of Binary Tree
        Difficulty: Easy

        Given the root of a binary tree, return its maximum depth.

        A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



        Example 1:

        Input: root = [3,9,20,null,null,15,7]
        Output: 3

        Example 2:

        Input: root = [1,null,2]
        Output: 2



        Constraints:

        The number of nodes in the tree is in the range [0, 104].
        -100 <= Node.val <= 100

*/
