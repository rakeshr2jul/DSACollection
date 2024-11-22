package org.ds.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LT40CombinationSumII {

    public static List<List<Integer>> combinationSum2(int [] candidate,int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidate);
        generateSubSets(0,candidate,new ArrayList<>(),result,target);
        return result;
    }

    static void generateSubSets(int start,int nums[],List<Integer> current,List<List<Integer>> result,int target)
    {
        if(target==0) {
            result.add(new ArrayList<>(current));
        }
        for(int i=start;i<nums.length;i++){
            if(i > start && nums[i]==nums[i-1])
                continue;
            current.add(nums[i]);
            generateSubSets(i+1,nums,current,result,target-nums[i]);
            current.remove(current.size()-1);
        }
    }
    public static void main(String args[]){
        int nums[] = {10,1,2,7,6,1,5};
       System.out.println( combinationSum2(nums,8));
    }
}
