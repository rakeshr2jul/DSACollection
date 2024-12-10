package org.ds.dp;

import java.sql.PreparedStatement;
import java.util.Arrays;

public class DistinctSubsequences115 {
     static int md = 1000000007;
    public static int numDistinct(String s, String t) {
       int dp[][]= new int [s.length()][t.length()];
       for(int i =0;i<s.length();i++){
           Arrays.fill(dp[i],-1);
       }

       return recur(s,t,0,0,dp)%md;
    }

    private static int recur(String s, String t,int i,int j,int dp[][]){

        if(j==t.length())
            return 1;

        if(i==s.length())
            return 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int take=0;
        if(s.charAt(i) == t.charAt(j)){
            take= recur(s,t,i+1,j+1,dp);
        }
        int notTake = recur(s,t,i+1, j,dp);
        return dp[i][j]= (take + notTake)%md;
    }

    public static void main(String[] args) {

        String s = "rabbbit";
        String t = "rabbit";

        System.out.println(numDistinct(s,t));
    }
}
