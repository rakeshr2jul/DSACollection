package org.ds.dp;

import java.util.Arrays;

public class HouseRobberII {

    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length ==2 )
            return Math.max(nums[0],nums[1]);

        int dp[][] = new int [nums.length] [nums.length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int t= helper(nums,0,nums.length-2,dp);
        int n = helper(nums,1,nums.length-1,dp);

        return Math.max(t,n);
    }

    private int helper(int nums[],int i,int n,int dp[][]){
        if(i > n){
            return 0;
        }

        if(dp[i][n] !=-1)
            return dp[i][n];

        int include = nums[i] + helper(nums,i+2,n,dp);
        int exc = helper(nums,i+1,n,dp);

        return  dp[i][n]= Math.max(include,exc);
    }


    public static void main(String[] args) {

    }
}
