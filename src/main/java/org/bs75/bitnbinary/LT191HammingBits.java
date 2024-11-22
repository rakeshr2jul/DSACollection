package org.bs75.bitnbinary;

public class LT191HammingBits {

    static int countBits(int n){
       int res=0;
        while (n!=0){
            n &= (n-1);
            res++;
        }
      return res;

    }
    public static void main(String args[]){
            System.out.println(countBits(00000000000000000000000000001011));
    }
}

