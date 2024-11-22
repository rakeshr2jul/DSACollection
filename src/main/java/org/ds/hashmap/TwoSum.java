package org.ds.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
     // Leetcode 1
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hs = new HashMap<>();

        for(int i =0 ; i<nums.length;i++){
            if(hs.containsKey(target-nums[i])){
                return new int[] {hs.get(target-nums[i]),i};
            }
            hs.put(nums[i],i);
        }
        return new int[2];
    }

    public static void main(String args[]){
        int nums [] = {3,3};
        int target = 6;

        int rs [] =twoSum(nums,target);

        for(int r : rs){
            System.out.print(r+" ");
        }

    }
}
