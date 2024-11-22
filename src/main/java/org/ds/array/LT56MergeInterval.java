package org.ds.array;

import java.util.Arrays;
import java.util.Stack;

public class LT56MergeInterval {

    public static int [][] merge(int [][] intervals){
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));

        Stack<int []> stack = new Stack<>();
        stack.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){
            int stPoint2 = intervals[i][0];
            int endPoint2 = intervals[i][1];

            int [] popArray = stack.pop();
            int stPoint1 = popArray[0];
            int endPoint1 = popArray[1];

            int max = Math.max(endPoint1,endPoint2);

            if(endPoint1 >= stPoint2) {
                int merge[] = new int[]{stPoint1, max};
                stack.add(merge);
            } else {
                stack.add(popArray);
                stack.add(intervals[i]);
            }
         }
          int op[][] = new int[stack.size()][2];

          for(int i= op.length-1;i >=0 ;i--){
              int [] popArray = stack.pop();
              op[i][0]=popArray[0];
              op[i][1]=popArray[1];
          }

        return op;

    }


    public static void main(String args[]){
        int intervals [][] = {{1,3},{2,6},{8,10},{15,18}};

      int res[][]=  merge(intervals);
        for(int[] row : res){// i=0;i<res.length;i++){
            System.out.println(Arrays.toString(row));
        }
    }
}
