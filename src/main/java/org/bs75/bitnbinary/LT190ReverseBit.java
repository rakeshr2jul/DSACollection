package org.bs75.bitnbinary;

public class LT190ReverseBit {

    static  public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
           int lsb = n & 1;
           int reverselsb = lsb << (31-i);
           res = res | reverselsb;
           n = n >> 1;

        }

     return res;
    }
    public static void main(String args[]){
           System.out.println(reverseBits(11100));
    }
}
