package org.ds.array;

public class MaxProduct152 {

    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int prdLeft = 1;
        int prdRight = 1;
        int ans = nums[0];

        for(int i=0; i< n ;i++){

            prdLeft = prdLeft == 0 ? 1 : prdLeft;
            prdRight = prdRight== 0 ? 1 : prdRight;

            prdLeft *=nums[i];
            prdRight *=nums[n-1-i];

            ans =  Math.max(ans,Math.max(prdLeft,prdRight));
        }

        return ans;
    }
    public static void main(String[] args) {

        int nums[]={-2};

        System.out.println(maxProduct(nums));
    }
}
