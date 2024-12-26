package org.ds.array;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualK {


    public static int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        int curr =0;
        int sum =0;
        map.put(0,1);

        for(int n : nums){
            curr +=n;
            sum += map.getOrDefault(curr-k,0);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return sum;
    }
    public static void main(String[] args) {
       int nums[] ={1,1,1};

        System.out.println(subarraySum(nums,2));
    }
}
