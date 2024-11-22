package org.ds.array;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int nums[] ={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }

    public static List<List<Integer>> threeSum(int nums[]){

        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i =0; i < nums.length;i++){
            int a = nums[i];
            if(i >0 && a==nums[i-1])
                continue;

            int lo= i+1;
            int hi = nums.length-1;
            while(lo < hi){
                int sum = a + nums[lo]+nums[hi];
                if(sum > 0){
                    hi --;
                }else if(sum < 0){
                    lo ++;
                }else{
                    res.add(Arrays.asList(a,nums[lo],nums[hi]));
                    lo++;
                    hi--;
                }
            }
        }
        return new ArrayList<>(res) ;
    }
}
