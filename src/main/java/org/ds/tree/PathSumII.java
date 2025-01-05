package org.ds.tree;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    // LT 113
   public static List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       List<Integer> path = new ArrayList<>();

       helper(root,targetSum,0,path);
      return  ans;
    }

    private static void  helper(TreeNode node, int targetsum ,int currSum,List<Integer> path){
        if(node == null){
            return;
        }

        currSum += node.val;
        path.add(node.val);
        if(currSum==targetsum && node.left == null && node.right == null){
            ans.add(new ArrayList<>(path));
        }

        helper(node,targetsum,currSum,path);
        helper(node,targetsum,currSum,path);

        path.remove(path.size()-1);
    }

    public static void main(String args[]){

    }
}
