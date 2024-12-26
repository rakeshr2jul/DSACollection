package org.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LT57InsertInterval {

    public static int[][] insert(int[][] intervals, int[] newInterval){

        int [][] newIntervals = Arrays.copyOf(intervals,intervals.length+1);

        newIntervals[newIntervals.length-1] = newInterval;

        return merge(newIntervals);

    }


    private static int[][] merge(int[][] intervals){

        if(intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));

        List<int[]> result = new ArrayList<>();
        int newInterval[] = intervals[0];
        result.add(newInterval);

        for(int interval[]:intervals){

            if(interval[0] <= newInterval[1]){

                newInterval[1] = Math.max(interval[1],newInterval[1]);
            }else {
                newInterval= interval;
                result.add(newInterval);

            }
        }


        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {


        int intervals [][] = {{1,3},{6,9}};
        int newint[]= {2,5};

       int res[][] = insert(intervals,newint);

        for(int[] row : res){// i=0;i<res.length;i++){
            System.out.println(Arrays.toString(row));
        }    }
}
