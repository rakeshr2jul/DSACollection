package org.ds.dp;

public class JumpGame {
    // Leetcode 55 {2,3,1,1,4}

    public static boolean canJump(int[] nums) {
        int reachable=0;
        if(nums.length==1)
            return true;
        for(int i=0;i<nums.length;i++){
           if(reachable < i)
                return false;
           reachable = Math.max(reachable,i+nums[i]);
        }
       return true;
    }
    public static void main(String args[]){
        int nums [] ={2,3,1,1,4};
       // int nums [] ={3,2,1,0,4};
        // 2,3,1,1,4
       System.out.println( canJump(nums));
    }

}
