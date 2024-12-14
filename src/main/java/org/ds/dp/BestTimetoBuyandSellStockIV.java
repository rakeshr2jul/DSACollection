package org.ds.dp;

public class BestTimetoBuyandSellStockIV {

    public static int maxProfit(int k, int[] prices) {
        return recur(prices,prices.length-1,k);
    }

    private static int recur(int prices[],int i , int k){

        if(i==0 || k==0)
            return 0;
        int dont = recur(prices,i-1,k);
        int doTrans=0;
        for(int j=0;j<i;j++){
            int profit = prices[i]-prices[j] + recur(prices,j,k-1);
            doTrans = Math.max(profit,doTrans);
        }
        return Math.max(dont,doTrans);

    }
    public static void main(String[] args) {


    }
}
