package org.bs75.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LT217ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n))
                return true;
            set.add(n);
        }

        return false;
    }


    public static void main(String args[]){

        int nums [] ={1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(nums));

    }
}
