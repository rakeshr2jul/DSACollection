package org.ds.string;

public class ScoreOfParanthesis {

    static int i =0;
    public static int scoreOfParentheses(String s) {
        int score=0;

        while (i < s.length()){
          char first = s.charAt(i);
          i++;
          if(first=='('){
              if(s.charAt(i)==')'){
                  score++;
                  i++;
              }else {
                  score = score + 2 * scoreOfParentheses(s);
              }
          }else {
              return score;
          }
      }
      return score;
    }


    public static void main(String args[]){

        System.out.println(scoreOfParentheses("(()(()))()"));

    }
}
