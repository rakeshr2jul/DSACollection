package org.ds.dp;

public class DeleteOperationfortwostrings583 {

    public static int minDistance(String word1, String word2) {
      return recur(word1,word2,0,0);
    }

    private static int recur(String s1,String s2, int i ,int j){
        if(i==s1.length() && j ==s2.length())
            return 0;

        if(i==s1.length())
            return s2.length()-j;
        if(j== s2.length())
            return s1.length()-1;

        if(s1.charAt(i) == s2.charAt(j))
            return recur(s1,s2,i+1,j+1);

        int opt1 = 1+ recur(s1,s2,i,j+1);
        int opt2 = 1+ recur(s1,s2,i+1,j);

        return Math.min(opt1,opt2);

    }
    public static void main(String[] args) {

       String word1 = "sea";
       String word2 = "eat";
        System.out.println(minDistance(word1,word2));


    }
}
