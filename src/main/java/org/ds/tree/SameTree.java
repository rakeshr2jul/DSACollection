package org.ds.tree;

public class SameTree {
    //LT100
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null || q ==null)
            return false;
        if(p.val != q.val)
            return false;

        return  isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static void main(String args[]){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        q.left.left = new TreeNode(4);
        q.left.right = new TreeNode(6);

        System.out.println("===="+isSameTree(p,q));
    }
}
