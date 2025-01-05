package org.ds.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhonePad {

    public static List<String> letterCombinations(String digits) {

        HashMap<Character,String> map = new HashMap<>();
        map.put('1'," ");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> ans = new ArrayList<>();

        if(digits.length() == 0)
            return ans;

        String temp = "";

        helper(0 , digits , temp , ans , map) ;

        return ans;

    }

    private static void helper(int start , String digits, String temp, List<String> ans, Map<Character,String> map){

        if(start == digits.length()){
            ans.add(temp);
            return;
        }
        char ch = digits.charAt(start);
        String str = map.get(ch);

        for(int i =0;i<str.length();i++){

            char  c= str.charAt(i);
            helper(start+1,digits,temp+c,ans,map);
        }
    }

    public static void main(String[] args) {

        List<String> l = letterCombinations("122");
        System.out.println(l);
    }
}
