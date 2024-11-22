package org.ds.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public static List<Integer> levelOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
            return res;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
           // List<Integer> tempList = new ArrayList<>();
           for(int i =0;i<n;i++){
               TreeNode temp= q.poll();
               res.add(temp.val);
               if(temp.left!=null) q.add(temp.left);
               if(temp.right!=null) q.add(temp.right);
           }
          // res.add(tempList);
        }
        return res;
    }




        public static void main(String args[]){
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
            root.right = new TreeNode(3);

            System.out.println(levelOrder(root));


        }

}
