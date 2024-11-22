package org.ds.recursion;

import java.util.ArrayList;
import java.util.List;

public class LT78Subsets {

    public static List<List<Integer>> subsets(int nums[]){
        List<List<Integer>> res = new ArrayList<>();

        generateSubSets(0,nums, new ArrayList<>(), res);

        return res;
    }
    static void generateSubSets(int start,int[] nums,List<Integer> current,List<List<Integer>> result){
        result.add(new ArrayList<>(current));
        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            generateSubSets(i+1,nums,current,result);
            current.remove(current.size()-1);
          }

    }

    public static void main (String args[]){
        int nums [] = {1,2,3};
        System.out.println(subsets(nums));
    }
}
