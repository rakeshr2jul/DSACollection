package org.ds.hashmap;

import java.util.*;

public class GroupAnagram {
    // Leetcode 49
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String >> hashMap = new HashMap<>();
        for(String str : strs){
             char [] ch = new char[26];
               for(char c : str.toCharArray()){
                   ch[c-'a']++;
               }
           // Arrays.sort(ch);
             String key = String.valueOf(ch);
            if(!hashMap.containsKey(key)){
                hashMap.put(key,new ArrayList<>());
            }
            hashMap.get(key).add(str);

       }
       return new ArrayList<>(hashMap.values());

    }


    public static void main(String args[]){
       String[] strs = {"eat","tea","tan","ate","nat","bat"};

      System.out.println( groupAnagrams(strs));

    }
}
