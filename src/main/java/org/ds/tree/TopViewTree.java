package org.ds.tree;

import java.util.*;

public class TopViewTree {

    public static List<Integer> getTreeTopView(TreeNode root){

        List<Integer> res = new ArrayList<>();
        if(root==null)
            return res;
        TreeMap<Integer,Integer> tMap = new TreeMap<>();
        leverOrder(tMap,0,root);
        res.addAll(tMap.values());
        return res;

    }

    public static void  leverOrder(TreeMap<Integer,Integer> tMap,int idx,TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> lIdx = new LinkedList<>();
        q.add(root);
        lIdx.add(idx);
        while (!q.isEmpty()){
             TreeNode node = q.poll();
             Integer index = lIdx.poll();

             if(!tMap.containsKey(index))
                 tMap.put(index,node.val);
             if(node.left!=null){
                 q.add(node.left);
                 lIdx.add(index-1);
             }
             if(node.right !=null){
                 q.add(node.right);
                 lIdx.add(index+1);
             }
        }
   }

    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

      System.out.println(getTreeTopView(root));
    }
}
