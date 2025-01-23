package com.gyakhoe.algomap.medium;

import com.gyakhoe.util.Node;

import java.util.*;

public class CloneGraphSolution {

    public Node cloneGraph(Node node) {
        if(node == null) return null;

        Map<Node, Node> oldToNew = new HashMap<>();
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>();

        stack.push(node);
        visited.add(node);

        while(!stack.isEmpty()) {
            Node currentNode = stack.pop();
            oldToNew.put(currentNode, new Node(currentNode.val));

            for(Node neighbor : currentNode.neighbors) {
                if(!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }

        // Let's join the neighbors
        for(Map.Entry<Node, Node> entry: oldToNew.entrySet()) {
            Node oldNode = entry.getKey();
            Node newNode = entry.getValue();
            for(Node neighbor: oldNode.neighbors) {
                newNode.neighbors.add(oldToNew.get(neighbor));
            }
        }

        return oldToNew.get(node);
    }
}
