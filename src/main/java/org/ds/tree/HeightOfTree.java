package org.ds.tree;

public class HeightOfTree {

    public static int calculateHeight(TreeNode root){

        if(root==null)
            return -1;

        int lh = calculateHeight(root.left);
        int rh = calculateHeight(root.right);

        return 1 + Math.max(lh,rh);

    }


    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
    /*    root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);*/


        System.out.println(calculateHeight(root));
    }
}
