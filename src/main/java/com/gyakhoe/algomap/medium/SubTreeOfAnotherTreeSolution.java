package com.gyakhoe.algomap.medium;

import com.gyakhoe.util.TreeNode;
import com.sun.source.tree.Tree;

public class SubTreeOfAnotherTreeSolution {

    public boolean isSubTree(TreeNode root, TreeNode subTree) {
        return hasSubTree(root, subTree);

    }

    private boolean hasSubTree(TreeNode root, TreeNode subTree) {

        if(root == null) return false;

        if(isSame(root, subTree)) return true;

        return  hasSubTree(root.left, subTree) || hasSubTree(root.right, subTree);
    }


    private boolean isSame(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;

        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
}
