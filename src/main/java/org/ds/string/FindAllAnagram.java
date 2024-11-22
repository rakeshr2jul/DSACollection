package org.ds.string;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagram {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
         int CHAR=26;
         int pCount[] = new int[CHAR];
         int match =0;
         for(int i=0;i<p.length();i++){
             pCount[p.charAt(i)-'a']++;
         }

         for(int i=0;i<s.length();i++){
            int current = s.charAt(i)-'a';
            pCount[current]--;
           while (pCount[current] <0){
               pCount[s.charAt(match++)-'a']++;
           }
           if((i-match+1) == p.length()){
               result.add(match);
           }
         }
        return result;
    }

    public static void main(String args[]){
        System.out.println(findAnagrams("cbaebabacd","abc"));
    }
}
