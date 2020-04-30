package com.company;


import com.company.TreeNode;

public class DiameterOfBinaryTree {

    // Accepted
    public static int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) { return 0;}
        max = 0;
        getDiameter(root);
        return max - 1;
    }

    public static int getDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getDiameter(root.left);
        int right = getDiameter(root.right);
        max = Math.max(max, left + right + 1);
        return Math.max(left, right) + 1;
    }

}
