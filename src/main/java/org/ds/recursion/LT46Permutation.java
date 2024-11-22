package org.ds.recursion;

import java.util.ArrayList;
import java.util.List;

public class LT46Permutation {

   /*public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        generatePermutation(res,nums,0);
        return res;
    }*/

    public static List<List<Integer>> backtrackPermute(int[] nums ){

        List<List<Integer>> res = new ArrayList<>();

        backtrackPermuteHelper(res,nums,new ArrayList<>());
        return  res;

    }

    public static void backtrackPermuteHelper(List<List<Integer>> res,int[] nums, List<Integer> tempList){
                if(tempList.size()== nums.length){
                    res.add(new ArrayList<>(tempList));
                    return;
                }

                for(int n: nums){
                    if(tempList.contains(n)) {
                        continue;
                    }
                    tempList.add(n);
                    backtrackPermuteHelper(res,nums,tempList);
                    tempList.remove(tempList.size()-1);
                }
    }

    public static List<List<Character>> permute(char[] nums) {
        List<List<Character>> res = new ArrayList<>();
        generatePermutation(res,nums,0);
        return res;
    }

    private static void generatePermutation(List<List<Character>> res,char[] nums, int st){
        if(st==nums.length){
            List<Character> permList = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                permList.add(nums[i]);
            }
            res.add(permList);
        }else{
            for(int i =st;i<nums.length;i++){
                swap(nums,st,i);
                generatePermutation(res,nums,st+1);
                swap(nums,st,i);
            }
        }
    }
  /*  private static void generatePermutation(List<List<Integer>> res,int[] nums, int st){
        if(st==nums.length){
            List<Integer> permList = new ArrayList<>();
            for(int n : nums){
                permList.add(n);
            }
             res.add(permList);
        }else{
            for(int i =st;i<nums.length;i++){
             if(i > st && nums[i-1]==nums[i]) {
                continue;
            }
                swap(nums,st,i);
                generatePermutation(res,nums,st+1);
                swap(nums,st,i);
            }
        }
   }*/

    private static void  swap(char nums[], int idx1, int idx2 ){
        char temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2]=temp;
    }

    public static void main(String args[]){
        int ar[] = {1,2,3};
        String str = "abc";

     //   List<List<Character>> res = permute(str.toCharArray());
      //  System.out.println(res);
        List<List<Integer>> rs =backtrackPermute(ar);
        System.out.println(rs);

        //backtrackPermute(ar).stream().forEach(s->s.stream().forEach(is->System.out.println(is)));
       // res.stream().forEach(s-> s.stream().forEach(is ->System.out.println(is)));
    }
}
