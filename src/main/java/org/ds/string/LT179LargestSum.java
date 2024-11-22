package org.ds.string;

import java.util.Arrays;

public class LT179LargestSum {

    public static String largestNumber(int[] nums) {
       String [] strings = new String[nums.length];
       if(nums.length==0 || nums==null)
           return "";

       for(int i=0;i<nums.length;i++){
           strings[i] = String.valueOf(nums[i]);
       }
        Arrays.sort(strings,(a,b) -> (b+a).compareTo(a+b));
       if(strings[0].charAt(0)=='0')
           return "0";
       StringBuilder  sb = new StringBuilder();
       for(String str: strings){
           sb.append(str);
       }
     return sb.toString();
    }
    public static void main(String args[]){
          int nums[]={3,30,34,5,9};
            System.out.println(largestNumber(nums));
    }
}
