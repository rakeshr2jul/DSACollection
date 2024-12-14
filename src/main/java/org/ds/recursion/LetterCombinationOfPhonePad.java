package org.ds.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhonePad {

    public static List<String> letterCombinations(String digits) {

        return helper("",digits);
    }

    private static List<String> helper(String p,String up){
        List<String> list = new ArrayList<>();

        if(up.isEmpty()) {

             list.add(p);
             return list;
        }

      //  List<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for(int i =(digit-1) *3 ;i < digit*3 ;i++){
                char ch= (char) ('a' + i);
               list.addAll( helper(p+ch,up.substring(1)));
        }
       return list;
    }

    public static void main(String[] args) {

        List<String> l = letterCombinations("12");
        System.out.println(l);
    }
}
