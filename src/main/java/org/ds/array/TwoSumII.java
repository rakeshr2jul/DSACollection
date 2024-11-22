package org.ds.array;

public class TwoSumII {
     // Leetcode 167
    public static int[] twoSum(int nums[],int target){

        int st =0;
        int end = nums.length-1;

        while (st < end){
          int sum =   nums[st]+nums[end];
          if(sum > target)
              end--;
          else if( sum < target)
              st++;
          else
              return new int[]{st+1,end+1};
       }
        return null;
    }

    public static void main(String args[]){
        int nums [] = {2,7,11, 12};
        int target = 9;
        int rs [] =twoSum(nums,target);

        for(int r : rs){
            System.out.print(r+" ");
        }

    }
}
