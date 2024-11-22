package org.ds.tree;

import java.util.*;

public class BottomViewTree {


    public static List<Integer> getBottomView(TreeNode root){

        List<Integer> res = new ArrayList<>();
        if(root==null)
            return res;

        TreeMap<Integer,Integer> tMap = new TreeMap<>();
        levelOrder(tMap,0,root);

        res.addAll(tMap.values());

        return res;
    }

    public static void levelOrder(TreeMap<Integer,Integer> tmap,Integer idx,TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> indexQueue = new LinkedList<>();

        q.add(root);
        indexQueue.add(idx);
        while (!q.isEmpty()){
          TreeNode node = q.poll();
          Integer index = indexQueue.poll();

          tmap.put(index, node.val);
          if(node.left!=null){
              q.add(node.left);
              indexQueue.add(index-1);
          }
          if(node.right !=null){
              q.add(node.right);
              indexQueue.add(index+1);
          }
        }
    }
    public static void main(String  args[]){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(getBottomView(root));
    }
}
