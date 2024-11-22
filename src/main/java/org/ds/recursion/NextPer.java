package org.ds.recursion;

public class NextPer {

      public static  void nextPermutation(int[] nums) {

            if(nums.length <=1)
                return;
            int i = nums.length-2;

            while(i >= 0 && nums[i] >=nums[i+1] )
                i--;

            if(i >= 0 ){
                int j = nums.length-1;
                while(j >=0 && nums[i] >= nums[j])
                    j--;
                swap(nums,i,j);
            }
            reverse(nums,i+1);
        }

        public static void swap(int nums[],int left,int right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right]= temp;
        }

       static void reverse(int nums[], int lo){
            int hi = nums.length-1;
            while(lo < hi){
                swap(nums,lo,hi);
                lo++;
                hi--;
            }
        }

      public static void main(String args[]){
          int nums[] = {2,0,2,1,1,0};
          nextPermutation(nums);
          for(int n : nums){
              System.out.print(" "+n);
          }
      }
}
