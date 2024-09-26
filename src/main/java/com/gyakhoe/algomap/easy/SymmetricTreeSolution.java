package com.gyakhoe.algomap.easy;


import com.gyakhoe.util.TreeNode;

public class SymmetricTreeSolution {

    public boolean isSymmetric(TreeNode root) {
        return isSame(root, root);
    }

    private boolean isSame(TreeNode root1, TreeNode root2) {

        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val != root2.val) return false;

        return isSame(root1.left, root2.right) && isSame(root1.right, root2.left);
    }

}
