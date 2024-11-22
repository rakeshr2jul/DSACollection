package org.ds.greedy;

import java.util.Arrays;

public class LT1710MaxUnitInTruck {

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) -> b[1]-a[1]);
        int maxUnit=0;
        for(int[] b : boxTypes){
            int count = Math.min(b[0],truckSize);
            maxUnit += count * b[1];
            truckSize -= count;
            if(truckSize == 0)
                return maxUnit;
        }
       return maxUnit;
    }
    public static void main(String args[]){
        int [][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize =4;
        System.out.println(maximumUnits(boxTypes,truckSize));
   }
}
