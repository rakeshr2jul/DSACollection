package org.ds.tree;

import java.util.ArrayList;
import java.util.List;

public class BoundryOfBinaryTree {


    private static void leaves(TreeNode node, List<Integer> result ) {

        if (node == null) {
            return;
        }
      ;
        if (node.left == null && node.right == null) {

            result.add(node.val);
        }

        leaves(node.left,result);
        leaves(node.right,result);
       // System.out.println(sum);
    }

    public static void main(String[] args) {

        /*
                    1
                 2     3
              4    5

         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> result = new ArrayList<>();
        int sum =0;
        leaves(root,result);
        System.out.println(result);
       // System.out.println(sum);

    }
    
}
