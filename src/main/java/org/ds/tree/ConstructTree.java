package org.ds.tree;

public class ConstructTree {

    // Construct tree with inorder and pre-order

     public static TreeNode buildTree(int preorder[],int inorder[]){

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

    public static void main(String args[]){
       int in[]={4, 2, 5, 1, 3};
       int pre[] = {1, 2, 4, 5, 3};

       TreeNode root = buildTree(pre,in);
          preOrder(root);
    }

}
