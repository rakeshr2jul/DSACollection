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

    public static int changeRec(int[] coins,int amount) {

        return rec(coins,amount,0);
    }

    private static int rec(int coins[],int amt, int i){
       if(amt==0)
           return 1;

       if(i==coins.length){
           return 0;
       }
       if(amt < 0)
         return 0;

        int stay = rec(coins,amt -coins[i],i);
        int move = rec(coins,amt,i+1);

        return stay+move;
    }


    public static void main(String args[]){

        int amount = 5;
        int coins[] = {1,2,5};

        System.out.println(changeRec(coins,amount));

    }
}
