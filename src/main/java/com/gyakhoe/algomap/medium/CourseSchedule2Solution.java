package com.gyakhoe.algomap.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CourseSchedule2Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        // Let's create a graph
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] prereq : prerequisites) {
            graph.get(prereq[1]).add(prereq[0]);
        }

        // Let's create some trackers
        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];
        Stack<Integer> stack = new Stack<>();

        // Perform DFS
        for(int i = 0; i < numCourses; i++) {
            if(!visited[i]){
                if(hasCycle(i,  graph, visited, recStack, stack)) {
                    return new int[0];
                }
            }
        }

        // Now that we have visited all vertices and there is no cycle
        int[] result = new int[numCourses];
        int index = 0;
        while(!stack.isEmpty()) {
            result[index++] = stack.pop();
        }

        return result;
    }

    private boolean hasCycle(int course, List<List<Integer>> graph, boolean[] visited, boolean[] recStack,
                             Stack<Integer> stack) {
        if(recStack[course]) return true;
        if(visited[course]) return false;

        recStack[course] = true;
        visited[course] = true;

        // lets checkout the neighbor for this course
        // Form of stacking, recursive, or DFS
        for(int neighbor : graph.get(course)) {
            if(hasCycle(neighbor, graph, visited, recStack, stack)) {
                return true;
            }
        }

        // Now there was no issue with course, remove it from recStack as we are done with course
        recStack[course] = false;
        stack.push(course); // push the course to stack, as it is valid
        return  false;
    }
}
