package org.ds.heap;

public class FindKthSmallestElement {


    private static void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    private static int quickSelect(int nums[],int L, int R){
      /*int i = L+1;
      int p = nums[L];
      int j = R;

      while (i < j){

          if(nums[i] <p && nums[j] > p){
              swap(nums,i,j);
              i++;
              j--;
          }
          if(nums[i] >= p){
              i++;
          }
          if(nums[j] <= p){
              j--;
          }
      }
      swap(nums,i,R);

      return i;*/

        int pivot = nums[R];
        int pivotloc = L;

        for(int i =L ;i <= R;i++ ){
            if(pivot < L){
                swap(nums,i,pivotloc);
               /* int temp = nums[i];
                nums[i] = nums[pivotloc];
               nums[pivotloc] = temp;*/
               pivotloc++;
            }
        }

       /* int temp = nums[R];
         nums[R] = nums[pivotloc];
         nums[pivotloc] = temp;*/
        swap(nums,R,pivotloc);

         return R;

    }

    static int kthSmallest(int nums[],int low,int high,int k){

        int partition = quickSelect(nums,low,high);

        if(partition==k) {
            return nums[partition];
        }else if(partition >k){
            return kthSmallest(nums,low,partition-1,k);
        }else {
            return kthSmallest(nums,partition+1,high,k);
        }

    }
    public static int findKthSmallest(int[] nums, int k){

       return kthSmallest(nums,0,nums.length-1,k);


    }
    public static void main(String[] args) {

        int nums[] ={3,2,1,5,6,4};//{2,1};//{3,2,1,5,6,4};
        int k =2;

        System.out.println(findKthSmallest(nums,k));

    }
}
