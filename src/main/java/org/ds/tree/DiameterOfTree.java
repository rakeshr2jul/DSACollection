package org.ds.tree;

public class DiameterOfTree {
    // LT 543
    static int dim=0;
    public static int diameterOfTree(TreeNode root){

        height(root);
        return dim;
    }

    static int height(TreeNode root){
        if(root==null)
            return -1;

        int lh = height(root.left);
        int rh = height(root.right);
       // dim = Math.max(dim,lh+rh);
        int dist = lh+rh+2;
       dim = Math.max(dist,dim);
       return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String args[]){

        TreeNode root =new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        System.out.println(diameterOfTree(root));

    }
}
