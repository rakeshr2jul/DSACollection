package org.ds.dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak139 {


    public static boolean wordBreak(String s, List<String> wordDict) {

        Set<String> words = new HashSet<>(wordDict);


        return helper(0,s,words);
    }

    private static boolean helper(int st, String s, Set words){

        if(st==s.length()){
            return true;
        }

        for(int end = st+1; end <= s.length();end++){

            if(words.contains(s.substring(st,end)) && helper(end,s,words)){
                return true;
            }
        }

       return  false;
    }
    public static void main(String[] args) {
        String s ="";
        List<String> list = Arrays.asList("leet","code");
        System.out.println(wordBreak(s,list));
    }
}
