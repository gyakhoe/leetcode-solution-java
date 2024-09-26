package com.gyakhoe.algomap.easy;

import com.gyakhoe.util.TreeNode;


public class SameTreeSolution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p, q);
    }

    private boolean isSame(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val == q.val) return true;

        return isSame(p.left, q.left) && isSame(p.right, p.left);
    }


}
