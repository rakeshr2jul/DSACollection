package org.ds.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomII {


    public  static int minMeetingRooms(int[][] intervals){

        Arrays.sort(intervals, (a,b)-> a[0]- b[0]);

        int newInterval[] = intervals[0];

        int res =1;
        //[5,8],[6,8]
        // {0,30},{5,10},{15,20}
      for(int i=1 ;i<intervals.length;i++){

          System.out.println("===="+intervals[i][1]+"=====");
            int min = Math.min(intervals[i][0],newInterval[0]);

            if( min < intervals[i][0] ){
                res++;
            }else {
                newInterval= intervals[i];
            }
        }
        return res;
        /*PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int[] interval: intervals ){
            if(pq.isEmpty()){
                pq.add(interval[1]);
               continue;
            }
            if(pq.peek() <= interval[0]){
                pq.remove();
            }
            pq.add(interval[1]);
        }
        return pq.size();*/
    }
    public static void main(String[] args) {

        int [][] ints = {{0,30},{5,10},{15,20}};//{{5,8},{6,8}};//{

        System.out.println(minMeetingRooms(ints));

    }
}
