package org.bs75.bitnbinary;

import java.util.Arrays;

public class LT1356SortTheInteger {

    public static int[] sortByBits(int[] arr) {
        //ok so for this enginner rule is applied where each number is updated by
        // a the number itself + number of bits in number*(10001) and then we will sort it
        // and then we will take the modulo.

        for (int i =0;i<arr.length;i++){
            arr[i] = arr[i]+Integer.bitCount(arr[i])*10001;
        }
        Arrays.sort(arr);

        for (int i=0;i<arr.length;i++){
            arr[i] =arr[i]%10001;
        }
        return arr;
    }

    public static void main(String args[]){

        int arr [] = {0,1,2,3,4,5,6,7,8};

        int n[] =sortByBits(arr);
        for (int i :n){
            System.out.print(i+" ");
        }
    }
}
