package org.bs75.array;

public class LT154FindMinRotatedArray {

    static int findMin(int nums[]){
        int st =0;
        int end =nums.length-1;

        while (st< end){
            int mid = st + (end-st)/2;
            if(nums[mid] > nums[end]){
                st= mid +1;
            }else if(nums[mid] < nums[end]){
                end = mid;
            }else {
                end--;
            }
        }
        return nums[st];
    }

    public static void main(String args[]){
     int nums [] ={3,3,3,3,3,3,4,1,2,3};

     System.out.println(findMin(nums));
    }
}
