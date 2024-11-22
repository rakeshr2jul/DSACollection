package org.ds.string;

public class Anagram {

    public static boolean isAnagram(String s,String d){
        int charSet = 26 ;
        int [] count = new int[charSet];
        if(s.length()!=d.length())
            return false;

        for(int i =0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[d.charAt(i) -'a']--;
        }

        for(int i=0;i< charSet;i++){
            if(count[i]!= 0)
              return false;
        }
        return true;
    }

    public static void main(String args[]){

        System.out.println(isAnagram("ant","tap"));
    }
}
