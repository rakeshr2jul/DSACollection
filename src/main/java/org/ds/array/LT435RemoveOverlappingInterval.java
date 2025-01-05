package org.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LT435RemoveOverlappingInterval {

    public  static  int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0){
            return 0;
        }
        //Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
       Arrays.sort(intervals, Comparator.comparingInt(i->i[1]));
        int res=0;

        int end = Integer.MIN_VALUE;

        for(int[] interval : intervals){
            if(interval[0] < end){
               res++;
            }else{
                end = interval[1];
            }
        }

        return res;

    }



    public static void main(String[] args) {

        int intervals[][] = {{1,3},{2,3},{3,4},{1,2}};
        int  res =   eraseOverlapIntervals(intervals);

        System.out.println(res);

    }
}
