package com.gyakhoe.algomap.medium;

import com.gyakhoe.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelTraversalSolution {

    public List<List<Integer>> levelOrder(TreeNode root) {


        List<List<Integer>> answer = new ArrayList<>();
        if(root == null) return answer;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                assert node != null;
                level.add(node.val);

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            answer.add(level);
        }
        return answer;
    }

}
