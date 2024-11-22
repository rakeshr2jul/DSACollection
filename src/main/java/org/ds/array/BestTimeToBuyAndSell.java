package org.ds.array;

//Leetcode 121
public class BestTimeToBuyAndSell {
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int minSoFar = Integer.MAX_VALUE;

        for(int price : prices){
            minSoFar = Math.min(minSoFar,price);
            maxProfit = Math.max(price-minSoFar,maxProfit);
        }
        return maxProfit;
    }


    public static void main(String args[]){
        int arr [] = {7,1,5,3,6,4};

        System.out.println("==="+ maxProfit(arr));
    }
}
