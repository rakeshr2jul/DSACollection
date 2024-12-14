package org.ds.recursion;

import java.util.Arrays;

public class QuickSortWithRecursion {

   public static void quickSort(int arr[]){

       sort(arr,0,arr.length-1);
   }

   private static void sort(int nums[],int lo ,int hi){

       if(lo >= hi)
           return;

       int s = lo;
       int e = hi;
       int mid = s + (e -s)/2;

       int pivot = nums[mid];

       while (s <= e){
           while (nums[s] < pivot){
               s++;
           }
           while (nums[e] > pivot){
               e--;
           }
         if(s <= e){
              int temp = nums[s];
              nums[s] =nums[e];
              nums[e] = temp;
             s++;
             e--;
         }
       }
       sort(nums,lo,e);
       sort(nums,s,hi);


   }
    public static void main(String[] args) {

        int nums[] ={5,4,3,2,1};

        quickSort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
