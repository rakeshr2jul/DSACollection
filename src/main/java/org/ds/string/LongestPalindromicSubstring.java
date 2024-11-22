package org.ds.string;

public class LongestPalindromicSubstring {

    // Leetcode 5

    public static String longestPalindrome(String s) {
            int st =0;
            int end =0;

            for(int i =0;i< s.length();i++){
               int oddlen = getLength(i,i,s);
               int evenlen = getLength(i,i+1,s);

               int len = Math.max(oddlen,evenlen);
               if(len > end-st){
                   st = i - (len-1)/2;
                   end = i + len/2;
               }
           }
       return s.substring(st,end+1);
    }

    public static int getLength(int left,int right,String s){
        if(s.length()==0 || left > right)
            return 0;
        while (left >=0 && right < s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String args[]){
        String str = "babd";

        System.out.println(longestPalindrome(str));
    }
}
