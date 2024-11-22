package org.ds.string;

import java.util.ArrayList;
import java.util.List;

public class LT442FindAllDuplicates {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums.length==0)
            return result;
      /*  for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index] < 0){
                  result.add(index+1);
            }
            nums[index] = nums[index] * -1;
        }*/
        for(int n : nums){
           if(nums[Math.abs(n)-1] < 0){
                result.add(n);
            }
            nums[Math.abs(n)-1] = - nums[Math.abs(n)-1];

        }
        return result;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,2,3,4,7};
        System.out.println(findDuplicates(nums));

    }
}
