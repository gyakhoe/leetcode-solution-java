package com.gyakhoe.algomap.medium;

import com.gyakhoe.util.TreeNode;

public class KthSmallestInBSTSolution {

    private int count;
    private int answer;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        answer = 0;
        dfs(root);
        return answer;
    }

    private void dfs(TreeNode root) {

        if(root == null) return;

        dfs(root.left);
        if(count == 1) answer = root.val;
        count--;
        if(count > 0) dfs(root.right);
    }
}
