package org.ds.recursion;

import java.util.ArrayList;
import java.util.List;

public class LT216CombinationSum3 {

    public static List<List<Integer>> combinationSum3(int k,int n){
        List<List<Integer>> result = new ArrayList<>();
        generateCombination(1,9 ,new ArrayList<>(),result,k,  n);

        return result;
    }
    static void  generateCombination(int start,int end,List<Integer> current,List<List<Integer>> result,int k, int target){

        if(target==0 && current.size()==k){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i= start;i<=end ;i++){
            current.add(i);
            generateCombination(i+1,end,current,result,k,target-i);
            current.remove(current.size()-1);
        }

    }
    public static void main(String args[]){
        System.out.println(combinationSum3(3,9));
    }
}
