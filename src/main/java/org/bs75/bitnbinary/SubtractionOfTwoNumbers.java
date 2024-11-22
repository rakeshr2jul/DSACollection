package org.bs75.bitnbinary;

public class SubtractionOfTwoNumbers {

    public static int sub(int a,int b){

        while (b!=0 ){
            int temp = (~a) & b;
            a = a ^ b;
           b =temp << 1;
        }

        return a;
    }

    public static void main(String args[]){
    System.out.println("sub :"+sub(29,-13));
    }
}
