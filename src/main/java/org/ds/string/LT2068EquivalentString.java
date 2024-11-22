package org.ds.string;

public class LT2068EquivalentString {

    public static boolean checkAlmostEquivalent(String word1, String word2) {

        int fre[] = new int[26];

        for(int i =0;i<word1.length();i++){
            fre[word1.charAt(i)-'a']++;
            fre[word2.charAt(i)-'a']--;
        }

        for(int i =0;i<fre.length;i++){
            if(Math.abs(fre[i])>3)
                return false;
        }
        return true;
    }

    public static void main(String args[]){
       String word1="abcdeef";
       String word2 = "abaaacc";

      System.out.println(checkAlmostEquivalent(word1,word2));
    }
}
