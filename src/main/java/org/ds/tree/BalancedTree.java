package org.ds.tree;

public class BalancedTree {
// LT 110

    public static boolean isBalanced(TreeNode root){
       if(root==null)
           return true;

        return height(root) !=-1;

    }

    public static int height(TreeNode root){
        if(root==null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        int d = Math.abs(lh-rh);
        if(d > 1 || lh==-1 || rh==-1)
           return -1;
        int h = 1+Math.max(lh,rh);
        return h;
    }


    public static void main(String arg[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(isBalanced(root));
    }
}
