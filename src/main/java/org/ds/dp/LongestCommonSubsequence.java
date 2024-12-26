package org.ds.dp;

//Leetcode 1143
public class LongestCommonSubsequence {

    public static int longestCommonSubsequence(String text1, String text2) {
         int dp[][] = new int[text1.length()+1][text2.length()+1];

         for(int i=1;i<dp.length;i++){
             for(int j=1; j<dp[0].length;j++){
                     if(text1.charAt(i-1)==text2.charAt(j-1)){
                         dp[i][j] = dp[i-1][j-1]+1;
                     }else{
                         dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                     }

             }
         }

        return dp[text1.length()][text2.length()] ;
    }


    public static  int longestCommonSubsequenceRec(String text1, String text2){
       int dp[][] = new int[text1.length()][text2.length()];
        return recur(text1,text2,0,0,dp);

    }

   private static int recur(String s1,String s2,int i ,int j ,int dp[][]){

        if(s1.length()==i || s2.length()==j)
            return 0;

        if(s1.charAt(i) == s2.charAt(j)){
            int ans = 1+ recur(s1,s2,i+1,j+1,dp);
            return ans;
        }
        if(dp[i][j] !=0)
            return dp[i][j];

        int incI = recur(s1,s2,i+1,j,dp);
        int incJ = recur(s1,s2,i,j+1,dp);

        return dp[i][j] = Math.max(incI,incJ);
   }


    public static void main(String args[]){
       System.out.println(longestCommonSubsequence("abcde","ace"));

        System.out.println(  longestCommonSubsequenceRec("abcde","ace"));
    }
}
