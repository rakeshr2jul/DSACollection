package org.ds.dp;

import java.util.Arrays;

public class CoinChange2 {

    public static int change(int[] coins,int amount) {

        if(amount==0 || coins.length==0)
            return 0;

        int dp[] = new int[amount+1];
        dp[0]=1;
        for(int coin:coins){
                for(int i=coin;i<=amount;i++){
                    dp[i] += dp[i-coin];
            }
        }
       return dp[amount];
    }

    public static int changeRec(int[] coins,int amount) {
      int dp[][] = new int[coins.length][amount+1];
       for(int i =0;i<dp.length;i++) {
           Arrays.fill(dp[i], -1);
       }
        return rec(coins,amount,0,dp);
    }

    private static int rec(int coins[],int amt, int i,int dp[][]){
       if(amt==0)
           return 1;

       if(i==coins.length){
           return 0;
       }
       if(amt < 0)
         return 0;

       if(dp[i] [amt] != -1){
           return dp[i][amt];
       }

        int stay = rec(coins,amt -coins[i],i,dp);
        int move = rec(coins,amt,i+1,dp);

        return dp[i][amt] = stay+move;
    }


    public static void main(String args[]){

        int amount = 5;
        int coins[] = {1,2,5};

        System.out.println(changeRec(coins,amount));

    }
}
