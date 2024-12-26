package org.ds.array;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {

    public static boolean canAttendMeetings(int[][] intervals) {

        if(intervals.length <= 1){
            return  true;
        }
        Arrays.sort(intervals, Comparator.comparingInt( i -> i[1]));


        for(int i =0 ; i< intervals.length-1;i++ ){
            if(intervals[i][1] > intervals[i+1][0]){
                return false;
            }
        }
          return true;
        }


    public static void main(String[] args) {
        int [][] ints = {{0,30},{5,10},{15,20}};

        System.out.println(canAttendMeetings(ints));
    }

    }


