package com.gyakhoe.algomap.medium;

import java.util.ArrayList;
import java.util.List;

public class CourseScheduleSolution {

        public boolean canFinish(int numCourses, int[][] prerequisites) {

            List<List<Integer>> graph = new ArrayList<>();
            for(int i = 0; i < numCourses; i++) {
                graph.add(new ArrayList<>());
            }

            for(int[] prerequisite : prerequisites) {
                int course = prerequisite[0];
                int prereq = prerequisite[1];
                graph.get(prereq).add(course);
            }

            int[] visited = new int[numCourses];

            for(int i = 0; i < numCourses; i++) {
                if(hasCycle(graph, visited, i)) return false;
            }
            
            return true;
        }

    private boolean hasCycle(List<List<Integer>> graph, int[] visited, int course) {
            if(visited[course] == 1) return true;
            if(visited[course] == 2) return false;

            visited[course] = 1;
            for(int neighbor : graph.get(course)) {
                if(hasCycle(graph, visited, neighbor)) return true;
            }
            visited[course] = 2;
        return false;
    }
}
