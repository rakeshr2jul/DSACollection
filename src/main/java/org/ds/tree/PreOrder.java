package org.ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {

    public static List<Integer> preOrder(List<Integer> op,TreeNode node){
        if(node==null)
            return op;

        if(node!=null) {
           // System.out.print(node.val+" ");
            op.add(node.val);
            preOrder(op,node.left);
            preOrder(op,node.right);
        }
        return op;
    }

    public static List<Integer> preOrderIterative(TreeNode node){
            List<Integer> res = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            if(node==null)
                return res;
            stack.add(node);
            while (!stack.isEmpty()){
                TreeNode temp = stack.pop();
                res.add(temp.val);
               // Right
                if(temp.right!=null){
                    stack.add(temp.right);
                }
               // Left
                if(temp.left!=null){
                    stack.add(temp.left);
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

        System.out.println(preOrder(pre,root));
        System.out.println(preOrderIterative(root));


    }
}
