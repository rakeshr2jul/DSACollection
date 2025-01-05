package org.ds.recursion;

public class LT526BeautyfulNumber {

    static int result=0;
    public static int countArrangement(int n) {
     int nums[] = new int[n+1];
     for(int i =1;i<=n;i++)
         nums[i] = i;
     return generateArrangement(nums,1);

    }

    private static int generateArrangement(int nums[],int index){
        if(index==nums.length)
            return 1;

        int ans =0;
        for(int i=index;i <nums.length ;i++){
            swap(nums,i,index);
            if(nums[index]%index==0 || index % nums[index]==0)
             ans +=  generateArrangement(nums,index + 1);
            swap(nums,i,index);
        }
        return ans;
    }
   private static void swap(int nums[],int idx1,int idx2){

       int temp = nums[idx1];
       nums[idx1] = nums[idx2];
       nums[idx2]= temp;

   }
   public static void main(String args[]){
        System.out.println(countArrangement(3));
    }
}
