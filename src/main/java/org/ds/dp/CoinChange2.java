package org.ds.dp;

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

    public static void main(String args[]){

        int amount = 0;
        int coins[] = {7};

        System.out.println(change(coins,amount));

    }
}
