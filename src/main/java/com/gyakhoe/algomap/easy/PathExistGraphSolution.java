package com.gyakhoe.algomap.easy;

import java.util.*;

public class PathExistGraphSolution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if(source == destination) return true;

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }

        Set<Integer> seen = new HashSet<>();
        seen.add(source);

        return dfs(source, destination, graph, seen);
    }

    private boolean dfs(int node, int destination, Map<Integer, List<Integer>> graph, Set<Integer> seen) {
        if(node == destination) return true;

        for(int neighbour : graph.getOrDefault(node, Collections.emptyList())) {
            if(!seen.contains(neighbour)) {
                seen.add(neighbour);
                if(dfs(neighbour, destination, graph, seen)) return true;
            }
        }
        return false;
    }
}
