package com.gyakhoe.algomap.medium;

import com.gyakhoe.util.TreeNode;

public class LowestCommonAncestorBST {
    TreeNode lcs;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // Using while loop to solve
        while(root != null) {
            if(root.val < p.val && root.val < q.val) {
                root = root.right;
            }else if(root.val > p.val && root.val > q.val) {
                root = root.left;
            }else {
                lcs = root;
                break;
            }
        }
        return root;
    }

    //Recursively searching.
    private void searchLCS(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null) return;

        lcs = root;
        if(root.val < p.val && root.val < q.val) {
            searchLCS(root.right, p, q);
        }else if(root.val > p.val && root.val > q.val) {
            searchLCS(root.right, p, q);
        }else {
            return;
        }

    }
}
