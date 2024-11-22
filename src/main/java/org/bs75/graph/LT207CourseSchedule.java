package org.bs75.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class LT207CourseSchedule {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adj = new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            adj[i]= new ArrayList<>();
        }

        for (int pre [] :prerequisites){
            adj[pre[0]].add(pre[1]);
        }

        for (ArrayList<Integer> a:adj){
            System.out.print(a+" ");
        }

        int[] visited = new int[numCourses];
        for (int i=0;i< numCourses;i++){
            if(visited[i]==0 && dfs(adj,visited,i))
                return false;

        }

        return true;
    }

    private static boolean dfs(ArrayList<Integer>[] adj,int[] visited,int v) {
        if (visited[v] == 1)
            return false;
        if(visited[v] == 2)
            return true;
        visited[v] = 1;

        for (int a : adj[v]){
            if (!dfs(adj,visited,v))
                return false;
        }
        visited[v]=2;
        return true;
    }
    public static void main(String args[]){
       int pre [][] = new int[][]{{0,1}};
        canFinish(2,pre);

    }
}
