package com.gyakhoe.algomap.easy;

import com.gyakhoe.util.TreeNode;

public class MinAbsoluteValueBSTSolution {
    private TreeNode prevNode = null;
    private int minDifference = Integer.MAX_VALUE;


    public int getMinDifference(TreeNode root) {
        inOrderTraversal(root);
        return minDifference;
    }

    private void inOrderTraversal(TreeNode node) {
        if(node == null) return;
        inOrderTraversal(node.left);
        if(prevNode != null) minDifference = Math.min(minDifference, node.val - prevNode.val);
        prevNode = node;
        inOrderTraversal(node.right);
    }
}
