package com.gyakhoe.algomap.easy;

import com.gyakhoe.util.TreeNode;

public class PathSumBinaryTreeSolution {

    public boolean hasPathSum(TreeNode root, int targetSum){
        int currentSum = 0;
        return hasSum(root, currentSum, targetSum);
    }

    private boolean hasSum(TreeNode root, int currentSum, int targetSum) {

        if(root == null) return false;
        currentSum += root.val;
        if(root.left == null && root.right == null) return currentSum == targetSum;
        return hasSum(root.left, currentSum, targetSum) || hasSum(root.right, currentSum, targetSum);
    }
}
