package org.ds.tree;

public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root){

        if(root==null)
            return null;

        TreeNode l = invertTree(root.left);
        TreeNode r = invertTree(root.right);

        root.left = r;
        root.right= l;

        return root;
    }

    public static void preOrder(TreeNode node){
       if(node!=null) {
           System.out.print(node.val+" ");
           preOrder(node.left);
           preOrder(node.right);
       }

    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

        preOrder(root);
        System.out.println();
       TreeNode node = invertTree(root);

       preOrder(node);


    }
}
