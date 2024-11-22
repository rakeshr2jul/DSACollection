package org.ds.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PemutationII {

    public static void main(String[] args) {

        int ar[] = {1,2,1};
        List<List<Integer>> res=  permuteUnique(ar);
        System.out.println(res);

    }


    public static List<List<Integer>> permuteUnique(int[] nums) {

        Set<List<Integer>> res = new HashSet<>();

        generatePermute(nums,res,0);

        return new ArrayList<>(res);

    }

   static void generatePermute(int[] nums, Set<List<Integer>> result,int start){
        if(start ==nums.length){
            List<Integer> permList = new ArrayList<>();
            for(int n : nums){
                permList.add(n);
            }
            result.add(permList);

        }else{

            for(int i=start;i<nums.length;i++){
                /*if(i > start && nums[i-1]==nums[i]) {
                    continue;
                }*/
                swap(nums,start,i);
                generatePermute(nums,result,start+1);
                swap(nums,start,i);
            }
        }

    }

    static void swap(int[] nums, int st,int end){

        int temp = nums[st];
        nums[st] = nums[end];
        nums[end] =temp;
    }
}
