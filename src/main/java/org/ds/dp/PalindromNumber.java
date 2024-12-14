package org.ds.dp;

public class PalindromNumber {


    public boolean isPalindrome(int x) {

        String num =  new String(Integer.toString(x));

        int st =0;
        int end = num.length();

        while (st < end){
            if(num.charAt(st) != num.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
       return true;
    }

    public static void main(String[] args) {

    }
}
