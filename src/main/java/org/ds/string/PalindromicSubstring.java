package org.ds.string;

//LeetCode 647
public class PalindromicSubstring {
        // example aaa
    public static int countSubstrings(String s) {

        int res =0;
       for(int i=0;i<s.length();i++){
             res+= countPalindrom(i,i,s);
             res+= countPalindrom(i,i+1,s);
       }

        return res;
    }

    public static int countPalindrom(int left, int right, String str){
      int res=0;
      while (left >= 0 && right < str.length()
              && str.charAt(left--)== str.charAt(right++)) {
          res++;
      }
      return res;
    }

    public static void main(String args[]){
        System.out.println(countSubstrings("aaa"));
    }
}
