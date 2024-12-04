package org.ds.dp;

import java.util.Arrays;

public class PartationEqualSubSetSum416 {

    static Boolean[][] dp;
    public static boolean canPartition(int[] nums) {

        int sum =0;
        int n = nums.length;
        for(int i : nums){
            sum += i;
        }

        if(sum %2 !=0){
            return false;
        }
         sum = sum/2;
      // dp = new Boolean[n+ 1][sum + 1];
        boolean dp[][] = new boolean[n+1][sum + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], false);
        }

        for(int i=0; i<= sum;i++){
            dp[0][i] = false;
        }

        for(int i=0; i<= n;i++) {
            dp[i][0] = true;
        }

        return  helper(nums,n,sum,dp);
    }

    private static boolean helper(int nums[], int pos , int sum,boolean dp[][]) {

    /*  if(pos >= nums.length || sum <0) {
          return false;
      }else if(sum==0) {
          return true;
      }*/
        if (dp[pos][sum]) {
            return dp[pos][sum];
        }
        if (nums[pos - 1] <= sum) {
            return dp[pos][sum] = helper(nums, pos - 1, sum - nums[pos-1], dp) ||
                    helper(nums, pos - 1, sum, dp);

        }else {
            return dp[pos][sum] =  helper(nums, pos - 1, sum, dp);
        }

    }

    public static void main(String[] args) {


       // int nums[] ={1,5,11,5};////
        int nums[] ={3,3,3,4,5};

        System.out.println(canPartition(nums));

    }
}
