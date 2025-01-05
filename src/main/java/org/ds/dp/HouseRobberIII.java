package org.ds.dp;

import org.ds.tree.TreeNode;
public class HouseRobberIII {

    public int rob(TreeNode root) {

        int options[] = new int[2];
        options = helper(root);

        return Math.max(options[0],options[1]);
    }

    private int[] helper(TreeNode node){

        if(node ==null){
            return new int[2];
        }

        int[] left_choice = helper(node.left);
        int[] right_choice = helper(node.right);
        int[] options = new int[2];

        options[0] = node.val + left_choice[1]+ right_choice[1];
        options[1] = Math.max(left_choice[0],left_choice[1]) + Math.max(right_choice[0],right_choice[1]);
        return options;

    }
}
