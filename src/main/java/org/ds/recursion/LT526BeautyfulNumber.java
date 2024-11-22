package org.ds.recursion;

public class LT526BeautyfulNumber {

    static int result=0;
    public static int countArrangement(int n) {
     int nums[] = new int[n+1];
     for(int i =1;i<=n;i++)
         nums[i] = i;
     generateArrangement(nums,n);
     return result;
    }

    private static void generateArrangement(int nums[],int val){
        if(val==0)
            result++;

        for(int i=val;i >0 ;i--){
            swap(nums,i,val);
            if(nums[val]%val==0 || val % nums[val]==0)
                generateArrangement(nums,val-1);
            swap(nums,i,val);
        }
    }
   private static void swap(int nums[],int idx1,int idx2){

        int temp = idx2;
        nums[idx2] = idx1;
        nums[idx1]= temp;
   }
   public static void main(String args[]){
        System.out.println(countArrangement(3));
    }
}
