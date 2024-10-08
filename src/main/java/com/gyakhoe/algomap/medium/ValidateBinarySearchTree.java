package com.gyakhoe.algomap.medium;

import com.gyakhoe.util.TreeNode;

public class ValidateBinarySearchTree {

    private int min = Integer.MIN_VALUE;
    private  int max = Integer.MAX_VALUE;

    public boolean isValidBST(TreeNode root) {
        return isValid(root, min, max);
    }


    private boolean isValid(TreeNode node, int min, int max) {
        if(node == null) return true;
        if(node.val <= min || node.val >= max) return false;
        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    }
}
