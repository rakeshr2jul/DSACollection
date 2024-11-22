package org.ds.array;

import java.util.HashMap;
import java.util.Map;

public class LT454FourSumII {

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> sMap = new HashMap<Integer,Integer>();
        for (int a : nums1){
            for (int b : nums2){
                int sum = a+b;
                sMap.put(-sum,sMap.getOrDefault(-sum,0)+1);
            }
        }
        int count =0;
        for(int c: nums3){
            for(int d: nums4){
                int sum = c+d;
                count +=sMap.getOrDefault(sum,0);
            }
        }
     return count;
    }
    public static void main(String args[]){
      /* int [] nums1 = {1,2};
       int [] nums2 = {-2,-1};
       int [] nums3 = {-1,2};
       int []nums4 = {0,2}; */

        int [] nums1 = {0};
        int [] nums2 = {0};
        int [] nums3 = {0};
        int []nums4 = {0};

       System.out.println(fourSumCount(nums1,nums2,nums3,nums4));
    }
}
