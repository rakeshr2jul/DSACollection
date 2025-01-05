package org.ds.tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructTree {

    // Construct tree with inorder and pre-order

     public static TreeNode buildTree(int preorder[],int inorder[]){
          Map<Integer,Integer> inOrderMap = new HashMap<>();
          for(int i =0; i< inorder.length;i++){
              inOrderMap.put(inorder[i],i);
          }
          return  splitTree(preorder,inOrderMap,0,0,inorder.length-1);
        //return createTree(preorder,inorder,0,n-1,0,n-1);

     }

     private static TreeNode splitTree(int preorder[], Map<Integer,Integer> hs, int rootIdx,int left,int right ){

              TreeNode root = new TreeNode( preorder[rootIdx]);
              int mid = hs.get(preorder[rootIdx]);

              if(mid > left){
                  root.left = splitTree(preorder,hs,rootIdx+1,left,mid-1);
              }
         if(mid < right){
             root.right = splitTree(preorder,hs,rootIdx+mid-left+1,mid+1,right);

         }

              return  root;

     }

    public static TreeNode buildTree1(int preorder[],int inorder[]){

        int n = preorder.length;

        return createTree(preorder,inorder,0,n-1,0,n-1);

    }

     public static TreeNode createTree(int preorder[],int inorder[],int ps,int pe,int is,int ie){

         if(is > ie)
             return null;

         int data = preorder[ps];
         TreeNode root = new TreeNode(data);
         int ri =-1;
         for(int i =is; i<=ie;i++){
             if(data==inorder[i]) {
                 ri = i;
                 break;
             }
         }

         int lis = is;
         int lie= ri-1;
         int ris= ri+1;
         int rie= ie;

         int lps= ps+1;
         int lpe = lie-lis+lps;
         int rps = lpe+1;
         int rpe = pe;


         root.left = createTree(preorder,inorder,lps,lpe,lis,lie);
         root.right = createTree(preorder,inorder,rps,rpe,ris,rie);

         return root;

     }


     public static void preOrder(TreeNode root){
         if(root!=null){
             System.out.print(root.val+" ");
             preOrder(root.left);
             preOrder(root.right);

         }

     }

    public static void postOrder(TreeNode root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");
        }

    }
    public static void main(String args[]){
       int in[]={9,3,15,20,7};
       int pre[] = {3,9,20,15,7};

       TreeNode root = buildTree(pre,in);
          preOrder(root);

        System.out.println();
        TreeNode root1 = buildTree1(pre,in);
       // preOrder(root1);

        postOrder(root1);

    }

}
