package org.bs75.bitnbinary;

public class LT371SumOfTwoIntegers {

    public static int sum(int a,int b){

        while (b !=0){
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;

        }

        return a ;
    }
    public static void main (String args[]){

        System.out.println("Sum = "+sum(5,4));
    }
}
