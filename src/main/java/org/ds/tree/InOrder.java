package org.ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder {

    public static List<Integer> inOrder(List<Integer> op, TreeNode node){
        if(node==null)
            return op;
        if(node!=null) {
            // System.out.print(node.val+" ");

            inOrder(op,node.left);
            op.add(node.val);
            inOrder(op,node.right);
        }


        return op;
    }

    public static List<Integer> inOrderIterative(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root==null)
          return  res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node !=null){
           if(node!=null){
               stack.add(node);
               node = node.left;
           }else {
              node= stack.pop();
               res.add(node.val);
               node=node.right;
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
        List<Integer> pre = new ArrayList<>();

     //   System.out.println(inOrder(pre,root));
        System.out.println(inOrderIterative(root));


    }
}
