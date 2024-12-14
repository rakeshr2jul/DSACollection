package org.ds.dp;

public class BestTimetoBuyandSellWithCoolDown309 {

    public static int maxProfit(int[] prices) {

        return recur(prices,prices.length-1,1);
    }

    static int recur(int prices[],int i, int state){

        if(i==0){
            if(state==0){
                return -prices[i];
            }
            return 0;
        }
        if(state==0){ // state 0 buy the stock
            int buy = -prices[i]+ recur(prices,i-1,2);
            int notBuy = recur(prices,i-1,state);
            return Math.max(buy,notBuy);
        }else if(state==1){ // state 1 sell the stock
            int sell = prices[i]+recur(prices,i-1,0);
            int notSell =recur(prices,i-1,state);
            return Math.max(sell,notSell);
        }else {
            int coolDown = recur(prices,i-1,1);
            int notCoolDown = recur(prices,i-1,state);
            return Math.max(coolDown,notCoolDown);
        }

    }

    public static void main(String[] args) {
          int prices[] ={1,2,3,0,2};


          System.out.println(maxProfit(prices));

    }
}
