package org.ds.tree;

import java.util.*;

public class ZigzagLevelOrder {

    public static List<List<Integer>> zigZagLevelOrder(TreeNode root){
       List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int countLevel=0;
        while (!q.isEmpty()){
            int n = q.size();
            List<Integer> level = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            for(int i=0;i<n;i++){
              TreeNode node = q.poll();
               if(countLevel%2==0){
                  level.add(node.val);
               }else {
                   stack.add(node.val);
               }
               if(node.left!=null) q.add(node.left);
               if(node.right!=null) q.add(node.right);
            }
            countLevel++;
            while (!stack.isEmpty()){
               level.add(stack.pop());
            }
           res.add(level);
        }


       return res;
    }


    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

        System.out.println(zigZagLevelOrder(root));


    }
}
