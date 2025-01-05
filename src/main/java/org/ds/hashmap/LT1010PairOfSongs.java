package org.ds.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LT1010PairOfSongs {

    public static int numPairsDivisibleBy60(int[] time) {
        Map<Integer,Integer> hm = new HashMap<>();
        int count =0;
        for(int t: time){
            if(t % 60==0)
                count += hm.getOrDefault(0,0);
            else
                count += hm.getOrDefault(60-t % 60,0);
            hm.put(t % 60, hm.getOrDefault(t % 60,0)+1);
        }
        return count;
   }

    public static int numPairsDivisibleBy601(int[] time) {
        Map<Integer,Integer> hm = new HashMap<>();
        int count =0;

        for(int i=0;i< time.length;i++){
            for(int j=i+1 ;j< time.length;j++){
               if(( time[i] + time[j]) % 60 == 0){
                   count++;
               }
            }
        }

        return count;
    }
   public static void main(String args[]){
        int s [] ={30,20,150,100,40};

        System.out.println(numPairsDivisibleBy601(s));
    }
}
