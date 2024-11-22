package org.ds.recursion;

import java.util.ArrayList;
import java.util.List;

public class LT77Combinations {

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubSets(1,n,k,new ArrayList<>(),result);
        return result;
    }

    static void generateSubSets(int start,int n,int k,List<Integer> current,List<List<Integer>> result){
        if(current.size()==k) {
            result.add(new ArrayList<>(current));
           // return;
        }
        for(int i=start;i<=n;i++){
            current.add(i);
            generateSubSets(i+1,n,k,current,result);
            current.remove(current.size()-1);
        }

    }


    public static void main (String args[]){

     System.out.println(combine(4,2));
    }
}
