package org.bs75.array;

public class LT33SearchInRotatedArray {

    public static int search1(int nums[],int target){
        int st =0;
        int end = nums.length-1;

        while (st <= end){
           // int mid = st +( (end-st)/2);
            int mid = (st+end)/2;
            if(nums[mid] == target) {
                return mid;
                // Left array
            }

            if (nums[st] <= nums[mid]){
                if( nums[st] <= target &&  nums[mid] >= target)
                    end = mid - 1;
                else
                    st = mid + 1;
            }else {
                // right array
                if(target >= nums[mid] && nums[end] >= target){
                    st = mid + 1;
                }else {
                    end = mid - 1;
                }
            }

        }
      return -1;
    }

    public static int search(int[] nums, int target) {
        int st =0;
        int end = nums.length-1;

        while(st <= end){
            int mid = st + (end - st) /2;
            if(nums[mid]==target)
                return mid;

            if(nums[st] <= nums[mid])   {
                if(nums[st] <=target  && nums[mid] >=target){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else{
                if(target >= nums[mid] &&  nums[end] <=target){
                    st= mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){
       // int nums[] ={4,5,6,7,0,1,2};
        int nums[] ={1,3};
        int target = 0;
       System.out.println(search(nums,target));
    }
}
