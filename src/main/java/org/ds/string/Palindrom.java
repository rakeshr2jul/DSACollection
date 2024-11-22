package org.ds.string;

import java.util.Locale;

public class Palindrom {
    // Leetcode : 125
    // example Aaa a
    public static boolean isValidPalindrom(String str){
        str =str.toLowerCase().replaceAll("[^a-z0-9]","");

        int st =0;
        int end = str.length()-1;

        while (st < end){
            if(str.charAt(st)!=str.charAt(end))
                return false;
            st++;
            end--;

        }

     //   System.out.println(str);

        return true;
    }


    public static void main(String args[]){
            String str = "A man, a plan, a canal: Panama";

     System.out.println(isValidPalindrom("abc"));
    }
}
