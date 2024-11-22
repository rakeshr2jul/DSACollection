package org.ds.dp;

import java.util.Arrays;

public class CoinChange {
    /**
     *  Leetcode : 322
     * Input: coins = [1,2,5], amount = 11
     * Output: 3
     * Explanation: 11 = 5 + 5 + 1
     * @param coins
     * @param amount
     * @return
     */
    public static int coinChange(int[] coins, int amount) {
      if(amount==0)
          return 0;
      int dp[] = new int[amount+1];
        Arrays.fill(dp,amount+1);
        for(int coin : coins){
           for(int i=coin;i<=amount;i++){
              dp[i]= Math.min(dp[i],dp[i-coin]+1);
            }
        }
        return dp[amount]<= amount? dp[amount] :-1;
    }
    public static void main(String args[]){

        int amount = 11;
        int coins[] = {1,2,5};

        System.out.println(coinChange(coins,amount));
    }
}
