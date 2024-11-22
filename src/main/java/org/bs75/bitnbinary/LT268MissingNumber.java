package org.bs75.bitnbinary;

public class LT268MissingNumber {

    public static int missingNumber(int[] nums) {
            int res =nums.length;

            for(int i=0;i<nums.length;i++){
                res +=(i-nums[i]);
            }
            return res;
    }
    public static void main(String args[]){
        int nums[]={9,6,4,2,3,5,7,0,1};
    System.out.println(missingNumber(nums));
    }
}
