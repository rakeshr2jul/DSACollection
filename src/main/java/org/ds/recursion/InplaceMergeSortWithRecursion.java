package org.ds.recursion;

import java.util.Arrays;

public class InplaceMergeSortWithRecursion {

    public static void mergeSortInplace(int arr[],int s, int e){

        if (e-s ==1 )
            return;
        int m = s +(e -s) /2;
        mergeSortInplace(arr,s,m);
        mergeSortInplace(arr,m,e);

        mergeInplace(arr,s,m,e);

    }

    private static void mergeInplace(int arr[],int s,int m,int e){

        int mix [] = new int[e-s];
        int i=s;
        int j=m;
        int k = 0;

        while (i < m && j < e){
            if(arr[i] < arr[j]) {
                mix[k] = arr[i];
              i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0; l<mix.length;l++){
            arr[s+l] = mix[l];
        }

    }

    public static void main(String[] args) {

        int nums[] = {3,4,2,1,5};

        mergeSortInplace(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));

    }
}
