package org.ds.array;

public class LT283MoveZeros {

    public static  int[] moveZeros(int nums[]){
        int l =0;

        for(int r =0; r < nums.length;r++){
            if(nums[r] !=0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] =temp;
                l++;
            }

        }
        return nums;

    }
    public static void main(String args[]){

        int n[] = {0,1,0,3,12};

        int an[] =moveZeros(n);

        for(int a : an){
            System.out.print(a+" ");
        }
    }
}
