package org.ds.dp;

public class BestTimetoBuyandSellStockWithFees714 {

    public static int maxProfit(int[] prices, int fee) {

        return recur(prices,fee,prices.length-1,1);
    }

    private static int recur(int prices[],int fee, int i, int state){

        if(i==0){
            if(state==0) {
                return -prices[i];
            }
            return 0;
        }
        if(state==0){
           int buy = recur(prices,fee,i-1,1) -prices[i];
           int notBuy = recur(prices,fee,i-1,0);
           return   Math.max(buy,notBuy);
        }else {
            int sell =prices[i]+ recur(prices,fee,i-1,0)-fee;
            int notSell = recur(prices,fee,i-1,1);
            return Math.max(sell,notSell);
        }

    }
    public static void main(String[] args) {

     int nums[] = {1,3,2,8,4,9};
     int fees=2;

        System.out.println(maxProfit(nums,fees));

    }
}
