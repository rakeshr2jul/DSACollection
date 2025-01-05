package org.ds.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargestElement {


   public static void swap(int nums[],int i ,int j){

       int temp = nums[i];
       nums[i] = nums[j];
       nums[j] = temp;
   }

   public static int quickSelect(int nums[] ,int L,int R){

       int i = L+1;
       int j = R;
       int p = nums[L];
       while (i < j) {
           if (nums[i] < p && nums[j] > p) {
               swap(nums, i, j);
               i++;
               j--;
           }

           if (nums[i] >= p) {
               i++;
           }
           if (nums[j] <= p) {
               j--;
           }
       }
        swap(nums,L,j);
       return i;
   }

    public static  int findKthLargest1(int[] nums, int k) {
        //  below is maxHeap
       PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
       // PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return  minHeap.poll();
    }

    public static int findKthLargest(int[] nums, int k) {

       int pivot_index=0;
      int n = nums.length;
       int L =0;
       int R = n-1;

       while (true){
           pivot_index = quickSelect(nums,L,R);
           if(pivot_index== k-1){
               break;
           }else if(pivot_index > k-1){
               R =pivot_index - 1;
           }else {
               L = pivot_index + 1;
           }
       }
      return nums[pivot_index];
    }
    public static void main(String[] args) {
      int nums[] ={3,2,1,5,6,4};
      int k =2;
        System.out.println(findKthLargest(nums,k));
        //System.out.println(findKthLargest1(nums,k));
    }
}
