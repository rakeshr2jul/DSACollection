package org.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewTree {

    public static List<Integer> rightViewTree(TreeNode root){
        List<Integer> res = new ArrayList<>();

        if(root==null)
            return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
             int size = q.size();

             for(int i =0;i<size;i++){
                 TreeNode node = q.poll();
                 if(i==size-1){
                     res.add(node.val);
                 }
                 if(node.left!=null) q.add(node.left);
                 if(node.right!=null) q.add(node.right);
             }
        }
       return res;
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

        System.out.println(rightViewTree(root));


    }
}
