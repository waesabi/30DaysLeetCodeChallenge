package com.company;

import com.sun.source.tree.Tree;

public class CheckStringValidFromRootToLeavesInBinaryTree {

    class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode() { }
        TreeNode(int val) { this.val = val; };
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    // Accepted
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return validateString(root,arr, 0);
    }

    public static boolean  validateString(TreeNode root, int[] arr,
                                          int currentIndex) {

        if (root == null) { return false; }
        /* if current index exceed the array limit and haven't
            reached the leaves
        */
        if (currentIndex >= arr.length) { return false; }

        if (root.left == null && root.right == null) {
            // if array is consumed and arr element are still left
            if (currentIndex != arr.length - 1) { return false; }
            // if current index is the last index
            if (root.val == arr[currentIndex]) { return true; }
            return false;
        }



        boolean left = false;
        boolean right = false;
        if (root.val == arr[currentIndex]) {
            currentIndex = currentIndex + 1;
            left = validateString(root.left, arr, currentIndex);
            right = validateString(root.right, arr, currentIndex);
        }
        return left || right;
    }

    /*
        false true 3
        false false 2
        true false 2
        false false 1
        true false 1
     */


}
