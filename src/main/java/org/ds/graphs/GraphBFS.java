package org.ds.graphs;

import java.util.*;

public class GraphBFS {

    public static void bfsOfGraph(int src, List<Integer> vis, List<List<Integer>> gf){

        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        vis.set(src,1);

        while (!q.isEmpty()){
            int curr = q.poll();
            for(int child : gf.get(curr)){
                if(vis.get(child) == 0){
                    q.add(child);
                    vis.set(child,1);
                }
            }
        }
    }

    public static void addEdge(List<List<Integer>> adj,int u,int v){

        adj.get(u).add(v);
        adj.get(v).add(u);

    }
    public static void main(String[] args) {

        int v = 4;

        List<List<Integer>> addList = new ArrayList<>();
        List<Integer> vis = new ArrayList<>();
        for(int i=0;i<v;i++){
            vis.add(0);
        }
        for(int i=0;i<v;i++){

            addList.add(new ArrayList<>());
        }

        addEdge( addList   ,0,1);
        addEdge(addList,0,2);
        addEdge(addList,1,2);
        addEdge(addList,1,3);



        bfsOfGraph(0,vis,addList);

        System.out.println(Arrays.asList(vis));
    }
}
