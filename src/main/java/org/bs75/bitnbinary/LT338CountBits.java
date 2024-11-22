package org.bs75.bitnbinary;

public class LT338CountBits {

    static int[] countBits(int n){
      int ans [] = new int[n+1];

      for(int i =0;i<ans.length;i++){

          ans[i] = rec(i,ans);
      }
     return ans;
    }

    private static int rec(int num,int memo[] ){

        if( num ==0)
            return 0;
        if(num == 1)
            return 1;
        if(memo[num]!=0){
            return memo[num];
        }

        if(num%2== 0) {
            memo[num] = rec(num / 2,memo);
            return rec(num / 2,memo);
        }
        else {
            memo[num] = 1+rec(num / 2,memo);
            return 1+rec((num / 2),memo);
        }

    }

    public static void main(String args[]){

        int ans [] =countBits(15);
        for(int a: ans) {
            System.out.print(a+" ");
        }

    }
}
