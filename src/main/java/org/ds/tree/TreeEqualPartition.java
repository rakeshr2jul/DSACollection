package org.ds.tree;

public class TreeEqualPartition {
   // LT 663
    public static boolean checkEqualPartitionTree(TreeNode root) {
          if(root==null)
              return false;

          int sum = calculateSumOfAllnodes(root);
          if(sum%2!=0)
              return false;
          return isTreeEqualPartition(root,sum);
    }

    public static int calculateSumOfAllnodes(TreeNode root){
        if(root==null)
            return 0;

        return  root.val+ calculateSumOfAllnodes(root.left) + calculateSumOfAllnodes(root.right);
    }

    public static boolean isTreeEqualPartition(TreeNode root,int target){
        if(root== null)
            return false;

        return target == calculateSumOfAllnodes(root);

    }

    public static void main(String arg[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(checkEqualPartitionTree(root));
    }
}
