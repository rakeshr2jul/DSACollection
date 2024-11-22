package org.ds.tree;

public class PathSum {
        //LT112
    public static boolean isPathSum(TreeNode root,int target){
      if(root==null)
          return false;

      if(root.left==null && root.right ==null && target-root.val==0 )
          return true;


      return isPathSum(root.left,target-root.val)
              || isPathSum(root.right,target-root.val);
     }

    public static void main(String args[]){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);


        System.out.println(isPathSum(p,10));
    }
}
