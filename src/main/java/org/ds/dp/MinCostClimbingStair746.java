package org.ds.dp;

public class MinCostClimbingStair746 {

    public static int minCostClimbingStairs(int[] cost) {
        return  Math.min(climb(cost,0),climb(cost,1));
    }
    private static int climb(int[] cost,int i){

        if(i==cost.length){
            return 0;
        }

        if(i > cost.length){
            return Integer.MAX_VALUE;
        }
        int iP= climb(cost,i+1);
        int iS=climb(cost,i+2);

        return Math.min(iP,iS)+cost[i];
    }


    public static void main(String[] args) {

        int nums[] ={10,15,20};

       System.out.println( minCostClimbingStairs(nums));
    }
}
