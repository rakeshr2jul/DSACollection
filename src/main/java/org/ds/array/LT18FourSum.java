package org.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LT18FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int k = 4;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> quad = new ArrayList<>();
      //  kSum(k,0,target,nums,res,quad);
        kSumHelper(0,k,target,nums,res,quad);
        return res;
    }

    static void kSumHelper(int st,int k, int target, int nums[],List<List<Integer>> res ,List<Integer> quad){
        Arrays.sort(nums);

        if(k!=2) {
            for (int i = st; i <= nums.length - k+1; i++) {
              if(i > st && nums[i] ==nums[i-1]) {
                  continue;
              }
                quad.add(nums[i]);
                kSumHelper(i+1,k-1, target - nums[i],nums,res, quad);
                quad.remove(quad.size()-1);
            }

            return;

        }
        int left= st;
        int right = nums.length-1;
        while (left < right) {
           if(left != st && nums[left]== nums[left-1]){
               left++;
                continue;
            }
            int sum = nums[left] + nums[right];

            if(sum==target){
                List<Integer> subResult = new ArrayList<>(quad);
                subResult.add(nums[left++]);
                subResult.add(nums[right--]);
                res.add(subResult);
            }else if(sum > target){
                right--;
            }else {
                left++;
            }
        }

    }

    /*private static void kSum(int k, int start, long target, int[] nums, List<List<Integer>> res, List<Integer> quad) {
        if (k != 2) {
            for (int i = start; i < nums.length - k + 1; i++) {
                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }
                quad.add(nums[i]);
                kSum(k - 1, i + 1, target - nums[i], nums, res, quad);
                quad.remove(quad.size() - 1);
            }
            return;
        }

        // base case, two sum II
        int left = start;
        int right = nums.length - 1;

        while (left < right) {
            if ((long)(nums[left] + nums[right]) < target) {
                left++;
            } else if ((long)(nums[left] + nums[right]) > target) {
                right--;
            } else {
                List<Integer> temp = new ArrayList<>(quad);
                temp.add(nums[left++]);
                temp.add(nums[right--]);
                res.add(temp);

                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
            }
        }
    }*/



    public static void main (String args[]){

       /* int [] nums = {2,2,2,2,2};
        int target = 8;*/
        int target=0;

        int nums[] ={1,0,-1,0,-2,2};
        System.out.println(fourSum(nums,target));

    }
}
