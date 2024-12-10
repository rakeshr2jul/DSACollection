package org.ds.dp;

public class LongestIncreasingSubsquence300 {

    public static int lengthOfLIS(int[] nums) {
       int n = nums.length;
       // return rec(nums,n-1,n);
        int dp[][] = new int [n+1][n+1];
        return memo(nums,n-1,n,dp);
    }

    private static int rec(int nums[],int idx,int next){
       if(idx < 0)
           return 0;
        int exc = rec(nums,idx-1,next);
        int inc =0;
        if(next==nums.length || nums[idx] < nums[next]){
            inc = rec(nums,idx-1,idx)+1;
        }

        return Math.max(exc,inc);
    }

    private static int memo(int nums[],int idx,int next,int dp[][]){
        if(idx < 0)
            return 0;
        if(dp[idx][next] !=0)   {
            return dp[idx][next];
        }
        int exc = memo(nums,idx-1,next,dp);
        int inc =0;
        if(next==nums.length || nums[idx] < nums[next]){
            inc = memo(nums,idx-1,idx,dp)+1;
        }

        return dp[idx][next]=Math.max(exc,inc);

    }
    public static void main(String[] args) {
        int nums[]={10,9,2,5,3,7,101,8,18};
        System.out.println(lengthOfLIS(nums));
    }
}
