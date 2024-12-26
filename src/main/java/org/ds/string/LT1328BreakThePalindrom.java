package org.ds.string;

public class LT1328BreakThePalindrom {

    public static String breakPalindrome(String palindrome) {

        int len = palindrome.length();
        if(len <= 1)
            return "";

        StringBuilder sb = new StringBuilder(palindrome);
        for(int i =0;i<len/2;i++){
           if(sb.charAt(i) !='a'){
               sb.setCharAt(i,'a');
               return sb.toString();
           }
        }

        sb.setCharAt(len-1,'b');
        return sb.toString();
    }

    public static void main(String args[]){
         System.out.println(breakPalindrome("abccba"));
    }
}
