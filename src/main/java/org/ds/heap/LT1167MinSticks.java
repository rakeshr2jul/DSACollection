package org.ds.heap;

import java.util.PriorityQueue;

public class LT1167MinSticks {

    public static int connectSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int res =0;
        for(int s : sticks){
            pq.add(s);
        }
        while(pq.size()>1){
           int cost = pq.poll() + pq.poll();
           res += cost;
           pq.add(cost);
        }
        return res;
    }


    public static void main(String args[]){
          int nums[]={2,4,3};

         System.out.println(connectSticks(nums));
    }
}
