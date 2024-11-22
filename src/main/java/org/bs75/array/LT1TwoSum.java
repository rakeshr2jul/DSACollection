package org.bs75.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LT1TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i <nums.length;i++){
            int compliment = target - nums[i];

            if(hm.containsKey(compliment)){
                return new int[]{hm.get(compliment),i};
            }
            hm.put(nums[i],i);

        }

        return null;


    }

    public static void main(String args[]){
     int nums[] = {2,7,11,15};
     int target = 9;

     int ans[] = twoSum(nums,target);

     for(int a: ans){
         System.out.println(a+" ");
     }

    }
}
