package org.ds.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeCodeDecode {

// LT 297 :
    public static String decode(TreeNode root){
        StringBuilder sb = new StringBuilder();
        preOrder(root,sb);

        return sb.toString();
    }

    public static void preOrder(TreeNode root,StringBuilder sb){
        if(root==null) {
            sb.append("null,");
        }else {
            sb.append(root.val + ",");

            preOrder(root.left, sb);
            preOrder(root.right, sb);
        }
    }

    public static TreeNode preOrder(List<String> data){
         String s = data.get(0);
        if(s.equals("null")) {
            data.remove(0);
            return null;
        }else {
            int num = Integer.parseInt(s);
            TreeNode root = new TreeNode(num);
            data.remove(0);
            root.left = preOrder(data);
            root.right = preOrder(data);

            return root;
       }



    }
    public static TreeNode code(String data){
        String [] strings = data.split(",");
        List<String> list = new ArrayList(Arrays.asList(strings));
      return preOrder(list);
    }


    public static void main(String arg[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

       String data = decode(root);
       System.out.println(data);

       TreeNode node =code(data);

       System.out.println(node.val);

    }
}
