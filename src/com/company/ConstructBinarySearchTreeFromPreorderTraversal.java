package com.company;
import com.company.TreeNode;

import java.util.Arrays;
import java.util.HashMap;


// Accepted
public class ConstructBinarySearchTreeFromPreorderTraversal {

    public static void main(String[] args) {
        int[] arr = {8,5,1,7,10,12};
        System.out.println(bstFromPreorder(arr));
    }

    public static int preOrderIndex = 0;
    public static TreeNode bstFromPreorder(int[] preorder) {
        preOrderIndex = 0;
        int size = preorder.length;
        if (size < 1) { return null; }
        int[] inOrder = new int[size];
        for (int i = 0; i < size; i++) {
            inOrder[i] = preorder[i];
        }

        Arrays.sort(inOrder);
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            indexMap.put(inOrder[i],i);
        }

        return constructBST(0, size - 1, preorder, inOrder, indexMap);
    }

    public static TreeNode constructBST(int start , int end, int[] preOrder,
                                        int[] inOrder,
                                        HashMap<Integer,Integer> indexMap) {
        if (start > end) { return null; }
        TreeNode root = new TreeNode(preOrder[preOrderIndex++]);
        if (start == end)  {return root; }
        int index = indexMap.get(root.val);
        root.left = constructBST(start, index - 1, preOrder,inOrder,indexMap);
        root.right = constructBST(index  + 1, end, preOrder, inOrder, indexMap);
        return root;
    }
}
