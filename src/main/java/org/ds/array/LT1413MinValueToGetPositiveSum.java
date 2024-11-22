package org.ds.array;

public class LT1413MinValueToGetPositiveSum {

    public static int minStartValue(int[] nums) {
        int sum =1;
        int max = 1;

        for(int i =0;i<nums.length;i++) {
            sum =sum - nums[i];
           // System.out.println(" "+sum);
          if( max < sum)
              max = sum;
        }
        return max;
    }

    public static void main(String args[]){
        int nums[] = {-3,2,-3,4,2};
        System.out.println(minStartValue(nums));

    }
}
