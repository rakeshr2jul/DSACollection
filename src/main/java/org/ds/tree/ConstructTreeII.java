package org.ds.tree;

import java.util.HashMap;
import java.util.Map;



public class ConstructTreeII {

    // Construct Tree using postorder n inorder array

    public static TreeNode buildTree(int in[],int post[]){

        int n = in.length;

        return createTree(in,post,0,n-1,0,n-1);

    }

    public static TreeNode buildTree1(int in[],int post[]){

        Map<Integer,Integer> inOrderMap = new HashMap<>();
        pos = post.length-1;
        for(int i =0; i< in.length;i++){
            inOrderMap.put(in[i],i);
        }
        TreeNode node=  splitTree(post,in,inOrderMap,0,in.length-1);

        return node;

    }
    static int pos =0;
    private static TreeNode splitTree(int post[],int in[], Map<Integer,Integer> hs,int start,int end ){

        if(pos<0 || start > end){
            return null;
        }
         int val = post[pos];

        TreeNode root = new TreeNode(val);
        pos--;

        int i = hs.get(val);
        TreeNode right = splitTree(post, in, hs,i+1, end);
        TreeNode left = splitTree(post, in, hs,start,i-1);

        root.right= right;
        root.left = left;

        return  root;

    }


    public static TreeNode createTree(int inorder[],int postorder[],int is,int ie,int ps,int pe){
        if(is > ie) {
            return null;
        }
        int data = postorder[pe];
       // System.out.print(data+",");
        TreeNode root = new TreeNode(data);

        int ri=-1;
         for(int i=is;i<=ie;i++){
             if(inorder[i]==data){
                 ri = i;
                 break;
             }
         }

         int lis=is;
         int lie=ri-1;
         int ris=ri+1;
         int rie=ie;

         int lps=ps;
         int lpe=lie-lis+lps;
         int rps=lpe+1;
         int rpe=pe-1;

        root.left = createTree(inorder,postorder,lis,lie,lps,lpe);
        root.right = createTree(inorder,postorder,ris,rie,rps,rpe);

        return root;

    }

    public static void preOrder(TreeNode root){
        if(root!=null){
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.val+" ");
        }

    }

    public static void main(String args[]){
      //  int in[]={4,2,5,1,3};
        int in[]={9,3,15,20,7};
        int post[] ={9,15,7,20,3};
      //  int pre[] = {1, 2, 4, 5, 3};

      /*  TreeNode root = buildTree(in,post);
        System.out.println();
        preOrder(root);*/

        TreeNode root1 =  buildTree1(in,post);

        System.out.println();
        preOrder(root1);
    }
}
