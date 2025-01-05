package org.ds.array;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualK {


    public static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int count =0;
        map.put(0,1);
        for(int n : nums){
            sum +=n;
            count += map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
       int nums[] ={1,1,1,1};

        System.out.println(subarraySum(nums,2));
    }
}
