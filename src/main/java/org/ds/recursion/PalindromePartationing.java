package org.ds.recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartationing {


    public  static List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();

        backtrack(0,s,new ArrayList<>(),result);

        return result;

    }

    private static void  backtrack(int st, String s, List<String> curr,List<List<String>> result){

        if(st == s.length()){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int end=st;end < s.length();end++){
            if(isPalindrome(st,end,s)){
               curr.add(s.substring(st,end+1));
               backtrack(end+1,s,curr,result);
               curr.remove(curr.size()-1);
            }

        }
    }


    private static boolean isPalindrome(int left,int right, String s){
        while (left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {


       List<List<String>> res= partition("aab");
       System.out.println(res);

    }
}
