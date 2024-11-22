package org.ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder {

    public static List<Integer> postOrder(List<Integer> op, TreeNode node){
        if(node==null)
            return op;

        if(node!=null) {
            postOrder(op,node.left);
            postOrder(op,node.right);
            op.add(node.val);
        }
        return op;
    }

    public static List<Integer> postOrderIter(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root);
        while (!stack1.isEmpty()){
            TreeNode node = stack1.pop();
            stack2.add(node);
            if(node.left != null)
                stack1.add(node.left);
            if(node.right !=null)
                stack1.add(node.right);
        }
        while (!stack2.isEmpty()){
            res.add(stack2.pop().val);
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

        System.out.println(postOrder(pre,root));
        System.out.println(postOrderIter(root));


    }
}
