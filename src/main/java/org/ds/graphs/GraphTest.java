package org.ds.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphTest {


    public static void main(String[] args) {

        int v = 4;

        List<List<Integer>> addList = new ArrayList<>();

        for(int i=0;i<v;i++){

            addList.add(new ArrayList<>());
        }
       addEdge( addList   ,0,1);
       addEdge(addList,0,2);
       addEdge(addList,1,2);
       addEdge(addList,1,3);
      //  System.out.println(Arrays.toString(adj));
        printGraph(addList);
    }


    public static void printGraph(List<List<Integer>> addList ){

     for(int i=0;i<addList.size();i++){
       System.out.println("\n vertex = "+i);
       System.out.println("path from "+i + " to ");
         for(int j =0;j<addList.get(i).size();j++){

             System.out.print("-->"+addList.get(i).get(j));
         }
         System.out.println();
     }

    }
    public static void addEdge(List<List<Integer>> adj,int u,int v){
       adj.get(u).add(v);
       adj.get(v).add(u);
    }
}
