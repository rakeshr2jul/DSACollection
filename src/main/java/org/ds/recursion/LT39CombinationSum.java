package org.ds.recursion;

import java.util.ArrayList;
import java.util.List;

public class LT39CombinationSum {

    static List<List<Integer>> combinationSum(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0,nums,new ArrayList<>(),result,target);
        return result;

    }

   static void generateSubsets(int start,int[] nums ,List<Integer> current, List<List<Integer>> result,int target){
        if(target==0) {
            result.add(new ArrayList<>(current));
        }
        if(target < 0 )
            return;
        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            generateSubsets(i,nums,current,result,target-nums[i]);
            current.remove(current.size()-1);
        }
    }

    public static void main(String args[]){
        int nums[]={2,3,6,7};
        System.out.println(combinationSum(nums,7));
    }
}
