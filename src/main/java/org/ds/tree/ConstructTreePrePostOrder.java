package org.ds.tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreePrePostOrder {

    public static TreeNode buildTree1(int pre[],int post[]){

        Map<Integer,Integer> postMap = new HashMap<>();
        int[] preIndex = {0};
        for(int i =0; i< post.length;i++){
            postMap.put(post[i],i);
        }
        TreeNode node=  splitTree(pre,postMap,preIndex,0,post.length-1);

        return node;

    }

    private static TreeNode splitTree(int pre[],Map<Integer,Integer> hs,int index[], int postSt,int postEnd){

        if(postSt > postEnd)
            return null;

        TreeNode node = new TreeNode(pre[index[0]]);
        ++index[0];

        if(postSt==postEnd)
            return node;

        int postIdx = hs.get(pre[index[0]]);

         node.left = splitTree(pre,hs,index,postSt,postIdx);
         node.right =splitTree(pre,hs,index,postIdx+1,postEnd-1);


        return node;



    }

    public static void postOrder(TreeNode root){
        if(root!=null){
            System.out.print(root.val+" ");
            postOrder(root.left);
            postOrder(root.right);

        }

    }

    public static void main(String[] args) {
        int pre[] = {3,9,20,15,7};
        int post[] ={9,15,7,20,3};

        TreeNode root = buildTree1(pre,post);

        postOrder(root);
    }
}
