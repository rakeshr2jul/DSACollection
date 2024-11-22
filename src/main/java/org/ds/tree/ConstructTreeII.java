package org.ds.tree;

public class ConstructTreeII {

    // Construct Tree using postorder n inorder array

    public static TreeNode buildTree(int in[],int post[]){

        int n = in.length;

        return createTree(in,post,0,n-1,0,n-1);

    }

    public static TreeNode createTree(int inorder[],int postorder[],int is,int ie,int ps,int pe){
        if(is > ie) {
            return null;
        }
        int data = postorder[pe];
        System.out.print(data+",");
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
        int in[]={4, 2, 5, 1, 3};
        int post[] ={4,5,2,3,1};
      //  int pre[] = {1, 2, 4, 5, 3};

        TreeNode root = buildTree(in,post);
        System.out.println();
        preOrder(root);
    }
}
