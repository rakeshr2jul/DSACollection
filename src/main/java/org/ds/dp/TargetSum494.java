package org.ds.dp;

import java.util.Arrays;

public class TargetSum494 {


    public static int findTargetSumWays(int[] nums, int target) {
       return    helper(nums,0,0,target,0) ;
      // return ans;
    }

    public static int helper(int nums[], int idx, int sum ,int target,int count){

        if(idx==nums.length) {
            if (sum == target) {
                count++;
            }
            return count;
        }
        int p=  helper(nums,idx+1,sum+nums[idx],target, count);
       int m =   helper(nums,idx+1,sum-nums[idx],target,count);

       return  p+m;

    }


    /*public static int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum =0;
        for(int i : nums){
            sum +=i;
        }
       if( sum <= Math.abs(target) || (sum+target) %2 !=0){
           return 0;
       }

        sum =(sum+target)/2;

        int dp[][] = new int[n][sum + 1];
        for (int row[] : dp)
            Arrays.fill(row, -1);
        return  helper(nums,0,sum,dp);
    }


    private static int helper(int[] nums,int pos,int sum,int dp[][]){

      return 0;

    }*/

    public static void main(String[] args) {
        int nums[] ={1,1,1,1,1};
       System.out.println( findTargetSumWays(nums,3));
    }
}
