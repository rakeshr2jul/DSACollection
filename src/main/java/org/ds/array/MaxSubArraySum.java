package org.ds.array;

// Leetcode 53
public class MaxSubArraySum {

    public static int maxSubArray(int nums[]){
        int maxSum =Integer.MIN_VALUE;
        int currSum = nums[0];
        if(nums.length==0)
            return 0;

        for(int n : nums){
            currSum = Math.max(n,currSum+n);
            if(currSum < 0)
                currSum=0;
            maxSum = Math.max(currSum,maxSum);
        }


       return maxSum;

    }

    public static int maxSubArrayI(int[] nums){

        if(nums.length ==0)
            return 0 ;

        int maxSum = Integer.MIN_VALUE;
        int currentSum =0;
        for(int i=0;i<nums.length ;i++){
            currentSum = Math.max(nums[i],currentSum*nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println("current sum: "+currentSum);
        return maxSum;
    }

    public static void main(String args[]){
        //int nums[] ={-2,1,-3,4,-1,2,1,-5,4};
        int nums[] = {-2,0,-1};

        System.out.println(maxSubArrayI(nums));
    }
}
