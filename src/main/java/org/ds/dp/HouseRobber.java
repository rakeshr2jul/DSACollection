package org.ds.dp;

public class HouseRobber {

    public static int rob(int[] nums) {
       int dp[] = new int[nums.length+1];
       // return  recur(nums,0);
        return memo(nums,0,dp);
    }

    private static int recur(int nums[], int s){
        if(s >= nums.length){
            return 0;
        }

        int inc = nums[s] + recur(nums, s+2);
        int exc = recur(nums, s+1);

        return Math.max(inc,exc);
    }

    private static int memo(int nums[], int s,int dp[]){
        if(s >= nums.length){
            return 0;
        }
       if(dp[s] !=0)
         return dp[s];

        int inc = nums[s] + memo(nums, s+2,dp);
        int exc = memo(nums, s+1,dp);

        return dp[s]= Math.max(inc,exc);
    }
    public static void main(String[] args) {

        int [] nums ={1,2,3,1};

        System.out.println(rob(nums));
    }
}
