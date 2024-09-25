package com.gyakhoe.algomap.easy;

import com.gyakhoe.util.TreeNode;

public class DiameterBinaryTreeSolution {

    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    private int height(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        maxDiameter  = Math.max(maxDiameter, (leftHeight + rightHeight));
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
