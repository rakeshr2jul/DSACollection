package org.ds.dp;

import java.util.Arrays;

public class EditDistance72 {

    public static int minDistance(String word1, String word2) {
         int n = word1.length();
         int m = word2.length();
         int dp[][] = new int [n][m];

         for(int i=0;i<n;i++){

             Arrays.fill(dp[i],-1);
         }
         return  recur(word1,word2,n-1,m-1,dp);

    }

    private static int recur(String s1,String s2,int i,int j,int dp [][]){
        if(i < 0)
            return j+1;
        if(j < 0)
            return i+1;


        if( s1.charAt(i) == s2.charAt(j) ){
            dp[i][j]= recur(s1,s2,i-1,j-1,dp);
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int replace = 1+ recur(s1,s2,i-1,j-1,dp);
        int insert = 1 + recur(s1,s2,i-1,j,dp);
        int del = 1+ recur(s1,s2,i,j-1,dp);

        return dp[i][j]= Math.min(replace,Math.min(insert,del));
    }
    public static void main(String[] args) {

        System.out.println(minDistance("horse","rose"));
    }
}
