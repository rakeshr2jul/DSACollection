package org.ds.tree;

import java.util.*;

public class VerticalOrderTraversal {

   public static List<List<Integer>> verticalOrder(TreeNode root){
       List<List<Integer>> res = new ArrayList<>();
       TreeMap<Integer, List<Integer>> tMap = new TreeMap<>();
       if(root==null)
           return res;
       levelOrder(root,0,tMap);
       res.addAll(tMap.values());
       return res;
   }
// LT 314

   public static void  levelOrder(TreeNode root,int idx,TreeMap<Integer,List<Integer>> tmap){
       Queue<TreeNode> q = new LinkedList<>();
       Queue<Integer> indexQueue = new LinkedList<>();
       q.add(root);
       indexQueue.add(idx);

       while (!q.isEmpty()){
         TreeNode node=  q.poll();
         int lindex = indexQueue.poll();
         if(!tmap.containsKey(lindex))
             tmap.put(lindex,new ArrayList<>());
         tmap.get(lindex).add(node.val);
         if(node.left!=null) {
             q.add(node.left);
             indexQueue.add(lindex-1);
         }
         if(node.right !=null){
             q.add(node.right);
             indexQueue.add(lindex+1);
         }
       }
    }
/*
                       1
                      / \
                     2   3
                    / \
                   4   5
 */
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

        System.out.println(verticalOrder(root));


    }

}
