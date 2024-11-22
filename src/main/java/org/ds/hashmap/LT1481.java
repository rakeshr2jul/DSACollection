package org.ds.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LT1481 {

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {

        Map<Integer,Integer> hm = new HashMap<>();

        for(int i =0 ;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(hm.values());

        while (k >0){
            k-= pq.poll();
        }
        return k < 0 ? pq.size()+1: pq.size();
    }

    public static void main(String args[]){

        int ar[] ={4,3,1,1,3,3,2};
        System.out.println(findLeastNumOfUniqueInts(ar,3));

    }
}
