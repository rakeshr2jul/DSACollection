package org.bs75.graph;

import java.util.*;

public class LT133CloneGraph {

    static class Node{

        private int val;
        ArrayList<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }


    public static Node cloneGraphDFS(Node node){

        if(node == null)
            return null;

        Map<Node,Node> map = new HashMap<>();
        Node newNode = new Node(node.val);
        map.put(node,newNode);
        for(Node n : node.neighbors){
            if(map.containsKey(n)) {
                newNode.neighbors.add(map.get(n));
            }else {
                newNode.neighbors.add(cloneGraphDFS(n));
            }
        }
        return newNode;
    }

    public static void printGraph(Node node){

        if(node!=null){
        //    System.out.println(node.val);
           for(Node ch: node.neighbors){
               System.out.println(ch.val+" ");
           }
        }

    }
    public static void main (String args[]){
        ArrayList<Node> ne = new ArrayList<>();
        ne.add(new Node(1));
        ne.add(new Node (2));
        ne.add(new Node(3));
        ne.add(new Node(4));

        Node node = new Node(1,ne);

        Node clone =cloneGraphDFS(node);
        printGraph(clone);

    }
}
