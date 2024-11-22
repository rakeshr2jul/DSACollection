package org.ds.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LT90SubsetsII {

    static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        generateSubsets(0  ,nums,new ArrayList<>(),results);
        return results;
    }

    static void generateSubsets(int start,int nums[],List<Integer> current,List<List<Integer>> results){
        results.add(new ArrayList<>(current));

        for(int i=start;i<nums.length;i++){
            if(i > start && nums[i-1]==nums[i]) {
                continue;
            }
            current.add(nums[i]);
            generateSubsets(i+1,nums,current,results);
            current.remove(current.size()-1);
        }
    }

    public static void main(String args[]){
        int nums[] ={1,2,2};

        System.out.println(subsetsWithDup(nums));
    }
}
