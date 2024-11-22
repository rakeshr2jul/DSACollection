package org.ds.dp;

public class LongestPalindromeSubseq {
        // Leetcode 516
    public static int longestPalindromeSubseq(String s) {
        String sb = new StringBuffer(s).reverse().toString();

        int dp[][] = new int[s.length()+1][sb.length()+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s.charAt(i-1)==sb.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }

            }
        }


        return dp[s.length()][sb.length()];

    }

    public static void main(String args[]){

       String s = "bbbab";


       System.out.println(longestPalindromeSubseq(s));
    }
}
