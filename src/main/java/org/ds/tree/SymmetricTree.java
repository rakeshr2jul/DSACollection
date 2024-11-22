package org.ds.tree;

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root){
       return helper(root,root);
    }

    public static boolean helper(TreeNode p , TreeNode q){

        if(p==null && q ==null)
            return true;
        if(p==null || q ==null)
            return false;

        if(p.val != q.val)
            return false;

       return helper(p.left,q.right) && helper(p.right,q.left);

    }

    public static void main(String args[]){

        /*
                        1
                      /  \
                     2    2
                   /  \  / \
                  4   5 5   4
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);

        System.out.println(isSymmetric(root));

    }
}
