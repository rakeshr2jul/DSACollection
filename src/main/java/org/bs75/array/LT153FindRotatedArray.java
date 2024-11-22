package org.bs75.array;

public class LT153FindRotatedArray {

    static int findMin(int nums[]){

        int st =0;
        int end = nums.length-1;
        while (st < end){
            int mid = st + (end -st)/2;
           // System.out.println(mid);
            if(nums[mid] > nums[end]) {
                st = mid + 1;
            } else {
                end = mid;
            }

        }

     return nums[st];
    }
    public static void main(String args[]){
            int nums [] = {3,4,5,0,2};

            System.out.println("minimum :"+findMin(nums));
    }
}
